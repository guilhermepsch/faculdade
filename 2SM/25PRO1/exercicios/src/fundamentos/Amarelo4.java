package fundamentos;

import java.util.*;

public class Amarelo4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rowA = scan.nextInt();
        int colA = scan.nextInt();
        int[][] matrizA = new int[rowA][colA];
        scan.nextLine();
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                matrizA[i][j] = scan.useDelimiter(";").nextInt();
            }
            scan.nextLine();
        }

        int rowB = scan.useDelimiter("\n").nextInt();
        int colB = scan.nextInt();
        int[][] matrizB = new int[rowB][colB];

        scan.nextLine();
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizB[i][j] = scan.useDelimiter(";").nextInt();
            }
            scan.nextLine();
        }

        int[][] matrizC = new int[rowA][colB];

        if (colA == rowB) {
            for (int i = 0; i < matrizC.length; i++) {
                for (int j = 0; j < matrizC[0].length; j++) {
                    matrizC[i][j] = 0;
                    for (int k = 0; k < matrizB.length; k++) {
                        matrizC[i][j] += (matrizA[i][k] * matrizB[k][j]);
                    }
                }
            }
            for (int i = 0; i < matrizC.length; i++) {
                for (int j = 0; j < matrizC[0].length; j++) {
                    System.out.print(matrizC[i][j] + ";");
                }
                System.out.print("\n");
            }
        }
        else {
            System.out.println("Impossível multiplicar");
        }

    }

}
