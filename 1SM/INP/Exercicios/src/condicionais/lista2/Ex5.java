package condicionais.lista2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        System.out.println("Informe o primeiro número");
        int iNum1 = s.nextInt();
        System.out.println("Informe o segundo número");
        int iNum2 = s.nextInt();
        System.out.println("Informe o terceiro número");
        int iNum3 = s.nextInt();
        System.out.println("Informe o tipo de ordem \n 1 - Decrescente \n 2 - Crescente");
        int iTipo = s.nextInt();
        String sRetorno = "\n";

        // PROCESSAMENTO
        if (iTipo > 2 || iTipo < 1)
            System.out.println("Tipo de ordem inválida.");
        else if (iNum1 == iNum2 || iNum2 == iNum3 || iNum1 == iNum3) {
            System.out.println("Combinação inválida, insira números diferentes.");
        } else if (iTipo == 1) {
            if (iNum1 > iNum2 && iNum1 > iNum3) {
                sRetorno = sRetorno + iNum1;
                if (iNum2 > iNum3)
                    sRetorno = sRetorno + "\n" + iNum2 + "\n" + iNum3;
                else
                    sRetorno = sRetorno + "\n" + iNum3 + "\n" + iNum2;
            } else if (iNum2 > iNum1 && iNum2 > iNum3) {
                sRetorno = sRetorno + iNum2;
                if (iNum1 > iNum3)
                    sRetorno = sRetorno + "\n" + iNum1 + "\n" + iNum3;
                else
                    sRetorno = sRetorno + "\n" + iNum3 + "\n" + iNum1;
            } else if (iNum3 > iNum2 && iNum3 > iNum1) {
                sRetorno = sRetorno + iNum3;
                if (iNum1 > iNum2)
                    sRetorno = sRetorno + "\n" + iNum1 + "\n" + iNum2;
                else
                    sRetorno = sRetorno + "\n" + iNum2 + "\n" + iNum1;
            }
        } else if (iTipo == 2) {
            if (iNum1 < iNum2 && iNum1 < iNum3) {
                sRetorno = sRetorno + iNum1;
                if (iNum2 < iNum3)
                    sRetorno = sRetorno + "\n" + iNum2 + "\n" + iNum3;
                else
                    sRetorno = sRetorno + "\n" + iNum3 + "\n" + iNum2;
            } else if (iNum2 < iNum1 && iNum2 < iNum3) {
                sRetorno = sRetorno + iNum2;
                if (iNum1 < iNum3)
                    sRetorno = sRetorno + "\n" + iNum1 + "\n" + iNum3;
                else
                    sRetorno = sRetorno + "\n" + iNum3 + "\n" + iNum1;
            } else if (iNum3 < iNum2 && iNum3 < iNum1) {
                sRetorno = sRetorno + iNum3;
                if (iNum1 < iNum2)
                    sRetorno = sRetorno + "\n" + iNum1 + "\n" + iNum2;
                else
                    sRetorno = sRetorno + "\n" + iNum2 + "\n" + iNum1;
            }
        }
        System.out.println(sRetorno);
        s.close();

    }
}