import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SimpleUDPServer {

    public static void main(String[] args) {
        final int PORT = 9876;

        try (DatagramSocket socket = new DatagramSocket(PORT)) {
            System.out.println("UDP Server is running on port " + PORT + "...");

            byte[] buffer = new byte[1024];

            while (true) {
                // Receive packet
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + received);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
