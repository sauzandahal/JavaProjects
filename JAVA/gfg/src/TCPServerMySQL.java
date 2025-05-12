import java.io.*;
import java.net.*;
import java.sql.*;

public class TCPServerMySQL{
    public static void main(String[] args) {
        int port = 1234; // TCP server port

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("TCP Server started on port " + port);

            while (true) {
                // Accept incoming TCP connection
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket.getInetAddress());

                // Handle client in a separate thread (optional for multiple clients)
                handleClient(socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket socket) {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
        ) {
            String query = in.readLine(); // Receive query from client
            System.out.println("Received query: " + query);

            // Connect to MySQL using JDBC
            String url = "jdbc:mysql://localhost:3307/connect"; // Change as needed
            String user = "root";
            String password = "dahal";

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    int code = resultSet.getInt("code");
                    String title = resultSet.getString("title");
                    out.println("Code: " + code + ", Title: " + title);
                }
            }

            out.println("END"); // signal end of data
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
