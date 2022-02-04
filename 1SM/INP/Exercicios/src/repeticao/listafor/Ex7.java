package repeticao.listafor;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        int iNegativos = 0;
        int iPositivos = 0;

        // PROCESSAMENTO
        for (int i = 1; i <= 20; i++) {
            System.out.println("Insira um número.");
            int iNumero = s.nextInt();

            if (iNumero < 0) {
                iNegativos++;
            }
            if (iNumero > 0) {
                iPositivos++;
            }
        }

        System.out.println(" Positivos: " + iPositivos * 5 + "% \n Negativos: " + iNegativos * 5 + "%");

        s.close();
    }
}