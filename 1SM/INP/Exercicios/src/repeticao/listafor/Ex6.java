package repeticao.listafor;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        System.out.println("Insira um número.");
        int iNumero = s.nextInt();
        int iResultado = iNumero;

        // PROCESSAMENTO
        for (int i = (iNumero-1); i > 0; i--) {
            iResultado = iResultado*i;
        }
        System.out.println(iResultado);
        s.close();
    }
}