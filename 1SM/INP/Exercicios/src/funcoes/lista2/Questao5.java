package funcoes.lista2;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] esfera = new int[4];
        int[] quantidade = new int[5];
        boolean checaPositivo = true;

        while (checaPositivo) {

            System.out.println("Insira o comprimento.");
            int comprimento = s.nextInt();
            System.out.println("Insira o largura.");
            int largura = s.nextInt();
            System.out.println("Insira o altura.");
            int altura = s.nextInt();

            if (comprimento < 1 || largura < 1 || altura < 1) {
                System.out.println("Número nulo ou negativo inserido, terminando o programa.");
                checaPositivo = false;
            }

            if (comprimento > 0 || largura > 0 || altura > 0) {
                System.out.println("Insira a quantidade de brinquedos do lote.");
                int quantidadeBrinquedo = s.nextInt();

                int diagonal = calculaDiagonal(comprimento, largura, altura);

                if (diagonal > 25) {
                    quantidade[4] = quantidade[4] + quantidadeBrinquedo;
                } else if (diagonal < 25 && diagonal > 20) {
                    quantidade[3] = quantidade[3] + quantidadeBrinquedo;
                } else if (diagonal < 20 && diagonal > 15) {
                    quantidade[2] = quantidade[2] + quantidadeBrinquedo;
                } else if (diagonal < 15 && diagonal > 10) {
                    quantidade[1] = quantidade[1] + quantidadeBrinquedo;
                } else if (diagonal < 10 && diagonal > 0) {
                    quantidade[0] = quantidade[0] + quantidadeBrinquedo;
                }
            }

        }
        System.out.println("Foram compradas " + (quantidade[0] + quantidade[1] + quantidade[2] + quantidade[3]) + " esferas, sendo estas..." +
                " \n 25cm - " + quantidade[3] +
                " \n 20cm - " + quantidade[2] +
                " \n 15cm - " + quantidade[1] +
                " \n 10cm - " + quantidade[0] +
                " \n Não cabem em uma esfera - " + quantidade[4]);
    }

    public static int calculaDiagonal(int comprimento, int largura, int altura) {
        return (int) Math.ceil(Math.sqrt(comprimento * 2 + largura * 2 + altura * 2));
    }

}
