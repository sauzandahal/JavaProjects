import java.sql.*;

public class ODBCExample {
    public static void main(String[] args) {
        String url = "jdbc:odbc:MyDSN";  // Ensure MyDSN is set up in ODBC
        String username = "root"; 
        String password = "dahal";

        try {
            // Use the old ODBC bridge (Java 7 or older)
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM post");

            while (resultSet.next()) {
                int code = resultSet.getInt("code");
                String title = resultSet.getString("title").trim();
                System.out.println("Code: " + code + " Title: " + title);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred!");
            e.printStackTrace();
        }
    }
}
