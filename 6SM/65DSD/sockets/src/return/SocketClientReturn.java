import java.io.*;
import java.net.*;

public class SocketClientReturn {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 3000);
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.print("Enter a message to send to the server: ");
            String messageToSend = userInput.readLine();

            out.println(messageToSend);

            String responseFromServer = in.readLine();

            System.out.println("Received from server: " + responseFromServer);
        }
    }
}
