package array;

import java.util.Scanner;

public class Questao5 {
    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] lista = new int[10];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Informe um valor");
            lista[i] = s.nextInt();
        }
        
        int cont = 0;
        for (int i = 1; i < lista.length; i++)
        	if ((lista[i] % 2) == 0)
        		cont++;
            
        System.out.println("Existem " + cont + " numeros pares no array");
    }

}
