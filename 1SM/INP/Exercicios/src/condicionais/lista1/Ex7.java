package condicionais.lista1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DE VALOR DO DIA

        System.out.println("Informe o valor para a verificação de par ou ímpar.");
        int iNumero = s.nextInt();

        // PROCESSAMENTO
        if (iNumero % 2 == 0)
            System.out.println("O número "+iNumero+" é par.");
        else
            System.out.println("O número "+iNumero+" é ímpar.");

        s.close();

    }
}