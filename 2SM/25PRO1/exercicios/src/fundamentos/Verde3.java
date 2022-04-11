package fundamentos;

import java.util.*;

public class Verde3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        long resultado = numero;
        if (numero == 0){
            resultado = 1;
        }

        for (int i = numero-1; i > 0; i--) {
            resultado = resultado*i;
        }

        System.out.println(resultado);

    }

}
