package registerOp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DB_URL = "jdbc:mysql://localhost/formdb?useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "root132639";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("username");
		String password=request.getParameter("password");
		
		RequestDispatcher dispatcher=null;
		Connection conn=null;
		HttpSession session=request.getSession();
		
		if(email==null || email.equals("")) {
			request.setAttribute("status", "invalidEmail");
			dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(password==null || password.equals("")) {
			request.setAttribute("status", "invalidPassword");
			dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			PreparedStatement prepstmt=conn.prepareStatement("SELECT * FROM employee WHERE email=? AND password=?");
			prepstmt.setString(2, password);
			prepstmt.setString(1, email);
			
			ResultSet res=prepstmt.executeQuery();
			if(res.next()) {
				session.setAttribute("name", res.getString("name"));
				dispatcher=request.getRequestDispatcher("index.jsp");
			}else {
				request.setAttribute("status", "failed");
				dispatcher=request.getRequestDispatcher("login.jsp");
			}
			
			dispatcher.forward(request, response);
			conn.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
