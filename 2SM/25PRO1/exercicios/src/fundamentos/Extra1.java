package fundamentos;

import java.util.*;

public class Extra1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        long resultado = fatorial(numero);
        System.out.println(resultado);

    }
    public static long fatorial(int valor) {

        if (valor == 0) {
            return 1;
        }

        long resultado = 1;

        for (int i = valor; i > 0; i--) {
            resultado = resultado * i;
        }
        return resultado;
    }

}
