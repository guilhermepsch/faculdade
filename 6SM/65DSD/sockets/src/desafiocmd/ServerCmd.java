package desafiocmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCmd {
  public static void main(String[] args) throws IOException {
    try (ServerSocket serverSocket = new ServerSocket(3000);
        Socket clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

      System.out.println("Conexão estabelecida com o cliente.");

      while (true) {
        String command = in.readLine();

        Process process = Runtime.getRuntime().exec(command);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
          output.append(line).append("\n");
        }

        out.println(output.toString());

        if (command.equals("exit")) {
          System.out.println("Desconectando...");
          break;
        }
      }
    }
  }
}
