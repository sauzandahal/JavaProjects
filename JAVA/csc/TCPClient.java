import java.io.*; 
import java.net.*; 

class TCPClient { 
    public static void main(String argv[]) throws Exception {
        String sentence; 
        String modifiedSentence; 
        
        BufferedReader inFromUser = 
             new BufferedReader(new InputStreamReader(System.in));
        
        // Use "localhost" for local testing or actual IP for server
        Socket clientSocket = new Socket("localhost", 6789); 
        
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
        
        System.out.print("Enter a sentence: ");
        sentence = inFromUser.readLine(); 
        
        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine(); 
        
        System.out.println("FROM SERVER: " + modifiedSentence); 
        
        clientSocket.close();
    } 
}


