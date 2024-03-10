package exemplo;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class ExemploSocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3000);
        server.setReuseAddress(true);

        while (true) {
            System.out.println("Aguardando conexão...");
            try (Socket conn = server.accept();
                 OutputStream out = conn.getOutputStream();
                 PrintWriter writer = new PrintWriter(out, true)) {

                System.out.println("Conectado com: " + conn.getInetAddress().getHostAddress());

                String msg = "Olá mundo do outro lado";
                writer.println(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
