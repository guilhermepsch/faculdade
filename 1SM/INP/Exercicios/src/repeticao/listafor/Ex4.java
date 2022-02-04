package repeticao.listafor;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        int iMenor = 0;
        int iMaior = 0;
        int iMedia = 0;

        // PROCESSAMENTO
        for (int i = 1; i <= 500; i++) {
            System.out.println("Insira um número.");
            int iNumero = s.nextInt();

            iMedia = iNumero + iMedia;

            if (iNumero < iMenor) {
                iMenor = iNumero;
            }
            if (iNumero > iMaior) {
                iMaior = iNumero;
            }
        }

        System.out.println("Menor:" + iMenor + "\n Maior:" + iMaior + "\n Media:" + iMedia);

        s.close();

    }
}