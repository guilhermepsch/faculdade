package condicionais.lista2;

import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // VARIAVEIS
        int iContinua = 1;
        int iBananaCaturraTotalCorreta = 0;
        int iBananaBrancaTotalCorreta = 0;
        int iColheresTotal = 0;
        int iAcucarTotal = 0;
        int iManteigaTotal = 0;
        int iBananaCaturraTotal = 0;
        int iBananaBrancaTotal = 0;
        
        // PROCESSAMENTO

        while (iContinua == 1) {
            System.out.println("Quantas gramas de banana caturra?");
            int iBananaCaturra = s.nextInt();

            System.out.println("Quantas gramas de banana branca?");
            int iBananaBranca = s.nextInt();

            System.out.println("Quantas colheres de sopa de suco de limão?");
            int iColheres = s.nextInt();

            System.out.println("Quantas gramas de açucar cristal?");
            int iAcucar = s.nextInt();

            System.out.println("Quantas gramas de manteiga?");
            int iManteiga = s.nextInt();

            if ((iBananaCaturra + iBananaBranca == 1000) && (iColheres > 1 && iColheres < 5)
                    && (iAcucar > 799 && iAcucar < 901) && (iManteiga > 99 && iManteiga < 121)) {
                System.out.println("Receita Correta");
                iBananaCaturraTotalCorreta = iBananaCaturraTotalCorreta + iBananaCaturra;
                iBananaBrancaTotalCorreta = iBananaBrancaTotalCorreta + iBananaBranca;
                iBananaCaturraTotal = iBananaCaturraTotal + iBananaCaturra;
                iBananaBrancaTotal = iBananaBrancaTotal + iBananaBranca;
                iColheresTotal = iColheresTotal + iColheres;
                iAcucarTotal = iAcucarTotal + iAcucar;
                iManteigaTotal = iManteigaTotal + iManteiga;
            } else {
                System.out.println("Receita Incorreta");
                iBananaCaturraTotal = iBananaCaturraTotal + iBananaCaturra;
                iBananaBrancaTotal = iBananaBrancaTotal + iBananaBranca;
            }
            System.out.println("Deseja Informar outra Receita? \n 1 - Sim \n 2 - Não");
            int iCheca = s.nextInt();
            if (iCheca == 1) {
                iContinua = 1;
            } else {
                iContinua = 0;
            }
        }

        // SAIDA

        System.out.println("O total de ingredientes gastos em receitas corretas foi: ");
        System.out.println("Banana caturra: " + iBananaCaturraTotalCorreta);
        System.out.println("Banana branca: " + iBananaBrancaTotalCorreta);
        System.out.println("Colheres de sopa de suco de limão: " + iColheresTotal);
        System.out.println("Açucar cristal: " + iAcucarTotal);
        System.out.println("Manteiga: " + iManteigaTotal);
        if (iBananaBrancaTotal > iBananaCaturraTotal) {
            System.out.println("O tipo mais utilizado de banana foi a Banana Branca");
        } else if (iBananaCaturraTotal > iBananaBrancaTotal) {
            System.out.println("O tipo mais utilizado de banana foi a Banana Caturra");
        } else {
            System.out.println("As bananas foram utilizadas em quantias iguais");
        }
        s.close();

    }
}