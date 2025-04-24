import java.sql.*;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the author name:");
            String author = scanner.nextLine();
            System.out.println("Enter the price:");
            double price = scanner.nextDouble();

            String url = "jdbc:mysql://localhost:3306/library";
            String username = "username";
            String password = "password";

            try {
                Connection conn = DriverManager.getConnection(url, username, password);
                String sql = "SELECT * FROM Book WHERE author = ? AND price < ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, author);
                stmt.setDouble(2, price);

                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Published Date: " + rs.getDate("published_date"));
                    System.out.println("Price: " + rs.getDouble("price"));
                    System.out.println("-----------------------------");
                }

                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

