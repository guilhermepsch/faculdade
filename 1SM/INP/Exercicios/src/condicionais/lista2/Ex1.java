package condicionais.lista2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DE VALOR DAS NOTAS

        System.out.println("Informe o valor da nota 1.");
        double iNota1 = s.nextDouble();
        System.out.println("Informe o valor da nota 2.");
        double iNota2 = s.nextDouble();
        System.out.println("Informe o valor da nota 3.");
        double iNota3 = s.nextDouble();
        System.out.println("Informe o tipo de média a ser utilizada. \n 1 - Aritmética \n 2 - Ponderada");
        int iTipo = s.nextInt();
        double iMedia = 0;

        // PROCESSAMENTO
        if (iTipo == 1) {
            iMedia = (iNota1 + iNota2 + iNota3) / 3;
        } else if (iTipo == 2) {
            System.out.println("Informe o peso da nota 1.");
            int iPeso1 = s.nextInt();
            System.out.println("Informe o peso da nota 2.");
            int iPeso2 = s.nextInt();
            System.out.println("Informe o peso da nota 3.");
            int iPeso3 = s.nextInt();
            iMedia = ((iNota1 * iPeso1 + iNota2 * iPeso2 + iNota3 * iPeso3) / iPeso1 + iPeso2 + iPeso3);
        } else {
            System.out.println("Valor incorreto informado, tente novamente.");
        }
        if (iMedia < 7) {
            System.out.println("Reprovado");
        } else
            System.out.println("Aprovado");

        s.close();

    }
}