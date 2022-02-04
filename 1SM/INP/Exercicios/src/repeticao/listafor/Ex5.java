package repeticao.listafor;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        System.out.println("Insira um número.");
        int iNumero = s.nextInt();
        boolean bPrimo = false;

        // PROCESSAMENTO
        for (int i = 2; i <= iNumero / 2; ++i) {
            // condition for nonprime number
            if (iNumero % i == 0) {
                bPrimo = true;
                break;
            }
        }
        if (bPrimo == false) {
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }
        s.close();
    }
}