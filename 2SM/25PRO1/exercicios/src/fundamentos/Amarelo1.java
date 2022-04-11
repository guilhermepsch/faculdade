package fundamentos;

import java.util.*;

public class Amarelo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] valorContador = {
                {50, 20, 10, 5, 2, 1},
                {0, 0, 0, 0, 0, 0}
        };

        String nome = scan.nextLine();
        int preço = scan.nextInt();
        int pago = scan.nextInt();
        int troco = pago - preço;

        for (int i = 0; i < valorContador[0].length; i++) {
            if (troco / valorContador[0][i] > 0) {
                valorContador[1][i] = (troco / valorContador[0][i]);
                troco -= (valorContador[0][i] * (troco / valorContador[0][i]));
            }
        }

        System.out.println(nome);
        for (int i = 0; i < valorContador[0].length; i++) {
            System.out.println(valorContador[1][i] + "x" + valorContador[0][i]);
        }
    }
}