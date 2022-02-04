package condicionais.lista1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DE VALOR DAS NOTAS

        System.out.println("Informe o valor da nota 1.");
        double iNota1 = s.nextDouble();
        System.out.println("Informe o valor da nota 2.");
        double iNota2 = s.nextDouble();
        System.out.println("Informe o valor da nota 3.");
        double iNota3 = s.nextDouble();
        System.out.println("Informe o valor da nota 4.");
        double iNota4 = s.nextDouble();
        double iMedia = (iNota1 + iNota2 + iNota3 + iNota4) / 4;
        System.out.println("Sua média atual: " + iMedia);

        // PROCESSAMENTO
        if (iMedia < 7) {
            System.out.println("Média abaixo de 7, por favor insira sua nota de exame.");
            double iExame = s.nextDouble();
            if (((iExame+iMedia)/2) >= 5){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
            System.out.println("Sua média final é de:" + ((iExame+iMedia)/2));
        } else
            System.out.println("Aprovado");

        s.close();

    }
}