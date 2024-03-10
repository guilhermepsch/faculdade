package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketChatClient {

  public static void main(String[] args) throws IOException {
    try (Socket socket = new Socket("localhost", 3000);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      while (true) {
        System.out.println("Você: ");
        String messageToSend = userInput.readLine();
        out.println(messageToSend);
        if (isExit(messageToSend)) {
          break;
        }
        String responseFromServer = in.readLine();
        System.out.println("Server: ");
        System.out.println(responseFromServer);
        if (isExit(responseFromServer)) {
          break;
        }
      }
    }
  }

  private static boolean isExit(String string) {
    if (string.equals("exit")) {
      System.out.println("Desconectando");
      return true;
    }
    return false;
  }
}
