package JDBC;

import java.sql.*;

public class JDBCMethods {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        // JDBC objects
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // Step 3: Create a statement
            statement = connection.createStatement();

            // Step 4: Execute a query
            String query = "SELECT * FROM employees";
            resultSet = statement.executeQuery(query);

            // Step 5: Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close the JDBC objects
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

