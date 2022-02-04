package condicionais.lista2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        System.out.println("Informe o primeiro lado do triângulo");
        int iNum1 = s.nextInt();
        System.out.println("Informe o segundo lado do triângulo");
        int iNum2 = s.nextInt();
        System.out.println("Informe o terceiro lado do triângulo");
        int iNum3 = s.nextInt();
        boolean bTrue = false;

        // PROCESSAMENTO
        if (iNum1 > iNum2 && iNum1 > iNum3) {
            if ((iNum2 * iNum2) + (iNum3 * iNum3) == (iNum1 * iNum1))
                bTrue = true;
        } else if (iNum2 > iNum1 && iNum2 > iNum3) {
            if ((iNum1 * iNum1) + (iNum3 * iNum3) == (iNum2 * iNum2))
                bTrue = true;
        } else if (iNum3 > iNum2 && iNum3 > iNum1) {
            if ((iNum2 * iNum2) + (iNum1 * iNum1) == (iNum3 * iNum3))
                bTrue = true;
        }
        if (bTrue == true)
            System.out.println("As medidas informadas são um triângulo retângulo");
        else
            System.out.println("As medidas informadas não são um triângulo retângulo");
        s.close();

    }
}