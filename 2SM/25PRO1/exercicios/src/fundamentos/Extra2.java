package fundamentos;

import java.util.*;

public class Extra2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        long resultado = fatorial(numero);
        System.out.println(resultado);

    }

    public static long fatorial(int valor) {

        if (valor <= 1) {
            return 1;
        }
        else {
            return valor * fatorial(valor-1);
        }
    }
}
