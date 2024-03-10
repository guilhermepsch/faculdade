package exemplo;
import java.net.UnknownHostException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExemploSocket {
    public static void main(String[] args) {
        System.out.println("Criando conexao...");
        try (Socket conn = new Socket("127.0.0.1", 3000);
             BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            System.out.println("Conectado!");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            System.out.println("Host nao encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída");
            e.printStackTrace();
        }
    }
}
