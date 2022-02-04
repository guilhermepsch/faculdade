package condicionais.lista1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DE SALDO MÉDIO
        System.out.println("Informe seu saldo médio (Ex: 1600.00)");
        double saldo = s.nextDouble();
        double credito = 0;

        // REALIZAÇÃO DO CÁLCULO DE SALDO
        if (saldo > 500 && saldo < 1001) {
            credito = ((saldo * 30) / 100);
        } else if (saldo > 1000 && saldo < 3001) {
            credito = ((saldo * 40) / 100);
        } else if (saldo > 3000) {
            credito = ((saldo * 50) / 100);
        }

        System.out.println("Seu saldo médio é: " + saldo);
        System.out.println("Seu crédito é: " + credito);
        s.close();

    }
}