import java.io.*;
import java.net.*;

public class SocketServerReturn {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(3000);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String messageFromClient = in.readLine();

            System.out.println("Received from client: " + messageFromClient);

            out.println(messageFromClient);
        }
    }
}
