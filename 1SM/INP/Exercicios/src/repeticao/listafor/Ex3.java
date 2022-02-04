package repeticao.listafor;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        int iNegativos = 0;
        int iEntre = 0;
        int iSoma = 0;

        // PROCESSAMENTO
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira um número.");
            int iNumero = s.nextInt();

            iSoma = iNumero + iSoma;

            if (iNumero < 0) {
                iNegativos++;
            }
            if (iNumero >= 5 && iNumero <= 50) {
                iEntre++;
            }
        }

        System.out.println("Dos números mencionados, " + iNegativos + " são negativos, " + iEntre
                + "estão entre 5 e 50, e a média entre os números é: " + (iSoma / 10) + ".");

        s.close();

    }
}