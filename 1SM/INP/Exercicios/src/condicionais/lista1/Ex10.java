package condicionais.lista1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DE VALOR DE PESO DO PEIXE

        System.out.println("Informe o peso total dos peixes em KG (Ex: 499.52)");
        int iPeixe = s.nextInt();

        // PROCESSAMENTO
        if (iPeixe > 500) {
            double dMulta = ((iPeixe - 500) * 4);
            System.out.println("Limite de peso excedido, o total de multa à pagar é: " + dMulta);
        } else {
            System.out.println("Tudo dentro dos conformes, não há multa.");
        }

        s.close();
    }

}