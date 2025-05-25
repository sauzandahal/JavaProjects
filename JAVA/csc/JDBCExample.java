import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3307/connect"; // Replace with your DB URL
        String username = "root"; // Replace with yourco DB username
        String password = "dahal"; // Replace with your DB password

        try {
            // Load MySQL JDBC drivernnectc
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database!");

            // Execute a query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM post"); // Replace with your table

            // Print results
            while (resultSet.next()) {
                System.out.println("code: " + resultSet.getInt("code")); // Replace 'id' with your column name
                System.out.println("title: " + resultSet.getString("title")); // Replace 'name'
            }

            // Close everything
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error connecting to database:");
            e.printStackTrace();
        }
    }
}
