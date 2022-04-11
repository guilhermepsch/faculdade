package fundamentos;

import java.util.*;

public class Azul4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[15];
        double media = 0;
        int menorValor = Integer.MAX_VALUE;
        int posicaoMenor = 0;
        int valorMaiorMedia = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scan.useDelimiter(";").nextInt();
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
                posicaoMenor = i;
            }
            media += vetor[i];
        }

        media = media/15;

        for (int j : vetor) {
            if (j >= media) {
                valorMaiorMedia++;
            }
        }

        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Qtd. >= média: " + valorMaiorMedia);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posição menor: " + posicaoMenor);
    }

}
