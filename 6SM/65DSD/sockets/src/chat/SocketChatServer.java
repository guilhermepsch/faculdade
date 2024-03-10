package chat;

import java.io.*;
import java.net.*;

public class SocketChatServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(3000);
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            while (true) {
                String messageFromClient = in.readLine();
                System.out.println("Client:");
                System.out.println(messageFromClient);
                if (isExit(messageFromClient)){
                    break;
                }
                System.out.println("Você:");
                String resposta = userInput.readLine();
                out.println(resposta);
                if (isExit(resposta)){
                    break;
                }
            }
        }
    }

    private static boolean isExit(String string){
        if (string.equals("exit")){
            System.out.println("Desconectando");
            return true;
        }
        return false;
    }
}
