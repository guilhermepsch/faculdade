import java.net.UnknownHostException;
import java.net.Socket;
import java.io.InputStream;
import java.io.IOException;

public class ExemploSocket {
    public static void main(String[] args) {
        System.out.println("Criando conexao...!");
        try (Socket conn = new Socket("127.0.0.1", 80)) {
            System.out.println("Conectado!");
            InputStream in = conn.getInputStream();

            byte[] dadosBrutos = new byte[1024];
            int qtdBytesLidos = in.read(dadosBrutos);
            while (qtdBytesLidos >= 0) {
                String dadosStr = new String(dadosBrutos, 0, qtdBytesLidos);
                System.out.println(dadosStr);
                qtdBytesLidos = in.read(dadosBrutos);
            }
        } catch (IOException e) {
            System.out.println("Host nao encontrado");
            e.printStackTrace();
        }
    }
}