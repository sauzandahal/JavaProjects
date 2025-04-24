import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Replace these with your own values
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "myusername";
        String password = "mypassword";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");
            // You can now perform database operations here
        } catch (SQLException e) {
            System.out.println("Error connecting to the database");
            e.printStackTrace();
        }
    }
}
