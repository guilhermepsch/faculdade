package array;

import java.util.Scanner;

public class Questao7 {
    public static void main (String[] Args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] listaA = new int[5];
        int[] listaB = new int[5];
        int[] listaC = new int[listaA.length + listaB.length];
        
        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Informe um valor para listaA[" + i + "]");
            listaA[i] = s.nextInt();
        }
        
        for (int i = 0; i < listaB.length; i++) {
            System.out.println("Informe um valor para listaB[" + i + "]");
            listaB[i] = s.nextInt();
        }
        
    	int idx = 0;
        for (int j : listaA) {
            listaC[idx] = j;
            idx += 2;
        }

    	idx = 1;
        for (int j : listaB) {
            listaC[idx] = j;
            idx += 2;
        }

        for (int j : listaC) System.out.println(j);
    }

}
