package condicionais.lista1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // ARRAY DE CALORIAS
        String[] aDia = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

        // LEITURA DE VALOR DO DIA
       
        System.out.println("Informe o Valor correspondente ao dia da semana:");
        int iDia = s.nextInt();

        // VALIDAÇÃO DA INSERÇÃO DE DADOS
        if (iDia > 0 && iDia < 8)
            System.out.println(aDia[iDia-1]);
        else
            System.out.println("Número inválido.");

        s.close();

    }
}