import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TCPMySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/connect";
        String user = "root";
        String password = "dahal";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM post");

            while (resultSet.next()) {
                int code = resultSet.getInt("code");
                String title = resultSet.getString("title").trim();
                System.out.println("Code: " + code + ", Title: " + title);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
