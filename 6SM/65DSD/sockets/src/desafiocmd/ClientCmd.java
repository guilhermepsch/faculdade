package desafiocmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientCmd {
  public static void main(String[] args) throws IOException {
    try (Socket socket = new Socket("localhost", 3000);
         BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

        System.out.println("Conexão estabelecida. Digite 'exit' para sair.");

        while (true) {
            System.out.print("Digite um comando: ");
            String command = userInput.readLine();

            out.println(command);

            if (command.equals("exit")) {
                System.out.println("Desconectando...");
                break;
            }

            String response = in.readLine();
            System.out.println("Resposta do servidor: " + response);
        }
    }
}
}
