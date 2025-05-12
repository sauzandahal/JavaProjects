import java.net.*;
import java.sql.*;
import java.io.*;

public class UDPJDBCServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        DatagramPacket packet;
        byte[] receiveData = new byte[1024];

        try {
            socket = new DatagramSocket(9876);
            System.out.println("UDP Server is listening on port 9876...");

            while (true) {
                packet = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(packet);

                String receivedMessage = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + receivedMessage);

                String response = processQuery(receivedMessage);

                InetAddress clientAddress = packet.getAddress();
                int clientPort = packet.getPort();
                byte[] sendData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
                System.out.println("Response sent: " + response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }

    private static String processQuery(String query) {
        String response = "Error: Invalid Query";

        if (query != null && query.toLowerCase().startsWith("select")) {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/connect", "root", "dahal");
                 Statement statement = connection.createStatement()) {

                ResultSet resultSet = statement.executeQuery(query);
                StringBuilder resultString = new StringBuilder();

                while (resultSet.next()) {
                    resultString.append(resultSet.getInt("id")).append(" - ")
                                .append(resultSet.getString("name")).append("\n");
                }

                response = resultString.toString();
            } catch (SQLException e) {
                response = "Error: Database connection failed.";
                e.printStackTrace();
            }
        }

        return response;
    }
}