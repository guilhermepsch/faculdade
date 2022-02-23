package funcoes;

import java.util.*;

public class Prova {

    public static void main(String[] args) {

        int[][] matriz = {{23, 6, 54345, 1321, 333},
                {33, 28, 4234, 341341, 6},
                {7900, 456789, 496, 496, 33},
                {8128, 6, 14431, 33550336, 890},
                {6, 496, 33550336, 3456, 34524}
        };

        int[] array = retornaArray(matriz);

        System.out.println("Valores válidos: ");
        for (int j : array) {
            System.out.println(j);
        }

    }

    public static int[] retornaArray(int[][] matriz) {

        int[] array = converteArray(matriz);

        array = removePerfeitoRepetido(array);

        array = ordenaArray(array);

        array = trataArray(array);

        return array;
    }

    public static int[] converteArray(int[][] matriz) {

        int[] array = new int[matriz.length * matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            int[] row = matriz[i];
            System.arraycopy(matriz[i], 0, array, i * row.length, row.length);
        }
        return array;
    }

    public static int[] ordenaArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < (array.length - 1); x++) {
                if (array[x] == 0) {
                    int aux = array[x + 1];
                    array[x + 1] = array[x];
                    array[x] = aux;
                }
            }
        }

        return array;
    }

    public static int[] removePerfeitoRepetido(int[] array){
        for (int i = 0; i < array.length; i++) {

            for (int x = 0; x < (array.length - 1); x++) {

                if (array[x] == array[x + 1])
                    array[x + 1] = 0;
                if (array[x] > array[x + 1]) {
                    int aux = array[x + 1];
                    array[x + 1] = array[x];
                    array[x] = aux;
                }
            }

            int soma = 0;

            for (int j = 1; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    soma += j;
                }
            }

            if (array[i] != soma) {
                array[i] = 0;
            }

        }
        return array;
    }

    public static int[] trataArray(int[] array){

        int counter = 0;

        for (int j : array) {
            if (j != 0) {
                counter++;
            }
        }

        int[] arrayTratado = new int[counter];

        System.arraycopy(array, 0, arrayTratado, 0, counter);
        return arrayTratado;
    }
}
