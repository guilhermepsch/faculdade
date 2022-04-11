package fundamentos;

import java.util.*;

public class Azul5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nRomano = scan.next();

        int resultado = calculaRomano(nRomano);

        System.out.println(resultado);

    }

    public static int calculaRomano(String nRomano) {

        int resultado = 0;

        for (int i = 0; i < nRomano.length(); i++) {

            int numero = converterChar(nRomano.charAt(i));

            if (i > 0 && numero > converterChar((nRomano.charAt(i - 1)))) {
                resultado += numero - (2*converterChar((nRomano.charAt(i - 1))));
            } else {
                resultado += numero;
            }

        }
        return resultado;
    }

    public static int converterChar(char caracter){

        Map<Character, Integer> hashRomano = new HashMap<>();
        hashRomano.put('M', 1000);
        hashRomano.put('D', 500);
        hashRomano.put('C', 100);
        hashRomano.put('L', 50);
        hashRomano.put('X', 10);
        hashRomano.put('V', 5);
        hashRomano.put('I', 1);

        return hashRomano.get(caracter);
    }

}
