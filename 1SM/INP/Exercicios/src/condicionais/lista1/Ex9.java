package condicionais.lista1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DE VALOR DAS NOTAS

        System.out.println("Informe o valor 1");
        int iValor1 = s.nextInt();
        System.out.println("Informe o valor 2");
        int iValor2 = s.nextInt();
        System.out.println("Informe o valor 3");
        int iValor3 = s.nextInt();
        System.out.println("Informe o valor 4");
        int iValor4 = s.nextInt();
        System.out.println("Informe o valor 5");
        int iValor5 = s.nextInt();
        int iMedia = (iValor1 + iValor2 + iValor3 + iValor4 + iValor5) / 5;
        System.out.println("A média dos valores é " + iMedia);
        String sRetorno = "Os valores que informados que são maiores que a média são: ";

        // PROCESSAMENTO
        if (iValor1 > iMedia)
            sRetorno = (sRetorno + iValor1);
        if (iValor2 > iMedia)
            sRetorno = (sRetorno + ", " + iValor2);
        if (iValor3 > iMedia)
            sRetorno = (sRetorno + ", " + iValor3);
        if (iValor4 > iMedia)
            sRetorno = (sRetorno + ", " + iValor4);
        if (iValor5 > iMedia)
            sRetorno = (sRetorno + ", " + iValor5);
        
        System.out.println(sRetorno);
        s.close();

    }
}