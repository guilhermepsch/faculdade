package condicionais.lista1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // ARRAY DE CALORIAS
        int[] aPratoCaloria = { 180, 230, 250, 350 };
        int[] aSobremesaCaloria = { 75, 110, 170, 200 };
        int[] aBebidaCaloria = { 20, 70, 100, 65 };

        // LEITURA DE VALORES DA REFEIÇÃO
        System.out.println("Informe o prato principal dentre as opções:");
        System.out.println(" 1 - Vegetariano \n 2 - Peixe \n 3 - Frango \n 4 - Carne");
        int iPrato = s.nextInt();

        System.out.println("Informe a sobremesa dentre as opções:");
        System.out.println(" 1 - Abacaxi \n 2 - Sorvete Diet \n 3 - Mousse Diet \n 4 - Mousse de Chocolate");
        int iSobremesa = s.nextInt();

        System.out.println("Informe a bebida dentre as opções:");
        System.out.println(" 1 - Chá \n 2 - Suco de Laranja \n 3 - Suco de Melão \n 4 - Refrigerante");

        int iBebida = s.nextInt();

        // VALIDAÇÃO DA INSERÇÃO DE DADOS
        if ((iPrato < 1 || iPrato > 4) || (iSobremesa < 1 || iSobremesa > 4) || (iBebida < 1 || iBebida > 4))
            System.out.println("Inserção de opções incorreta, tente novamente.");

        // REALIZAÇÃO DOS CÁLCULOS DE CALORIA

        int iCaloria = aPratoCaloria[iPrato - 1] + aSobremesaCaloria[iSobremesa - 1] + aBebidaCaloria[iBebida - 1];

        System.out.println("O total de calorias da refeição é " + iCaloria + " calorias");
        s.close();

    }
}