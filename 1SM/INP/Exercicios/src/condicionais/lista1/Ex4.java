package condicionais.lista1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // LEITURA DE IDADE
        System.out.println("Informe sua idade (Ex: 16)");
        int idade = s.nextInt();

        // REALIZAÇÃO DO CÁLCULO DE SALDO
        if (idade < 16) {
            System.out.println("Não eleitor");
        } else if (idade > 17 && idade < 65) {
            System.out.println("Eleitor obrigatório");
        } else if (idade > 64 || (idade > 15 && idade < 18)) {
            System.out.println("Eleitor facultativo");
        }

        s.close();

    }
}