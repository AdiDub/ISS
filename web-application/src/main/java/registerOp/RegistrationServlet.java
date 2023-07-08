package registerOp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DB_URL = "jdbc:mysql://localhost/formdb?useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "root132639";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String mobile=request.getParameter("contact");
		String retypedpassword=request.getParameter("re_pass");
		
		RequestDispatcher dispatcher=null;
		Connection conn = null;
		
		
		if(name==null || name.equals("")) {
			request.setAttribute("status", "InvalidName");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(email==null || email.equals("")) {
			request.setAttribute("status", "InvalidEmail");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(password==null || password.equals("")) {
			request.setAttribute("status", "InvalidPassword");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(retypedpassword==null || retypedpassword.equals("")) {
			request.setAttribute("status", "InvalidRetypedpassword");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
			return;
		}
		if(mobile==null || mobile.equals("")) {
			request.setAttribute("status", "InvalidContact");
			dispatcher=request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
			return;
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			PreparedStatement prepstmt=conn.prepareStatement("INSERT INTO employee (name,password,email,mobile) VALUES (?,?,?,?)");
			prepstmt.setString(1, name);
			prepstmt.setString(2, password);
			prepstmt.setString(3, email);
			prepstmt.setString(4, mobile);
			
			int rowCount=prepstmt.executeUpdate();
			dispatcher=request.getRequestDispatcher("login.jsp");
			if(rowCount>0) {
				request.setAttribute("status", "success");
			}else {
				request.setAttribute("status", "failed");

			}
			dispatcher.forward(request, response);
			conn.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
