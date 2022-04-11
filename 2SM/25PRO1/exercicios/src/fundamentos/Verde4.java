package fundamentos;

import java.util.*;

public class Verde4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int quartaLinha = 0;
        int segundaColuna = 0;
        int diagonalPrincipal = 0;
        int diagonalSecundária = 0;
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scan.useDelimiter(";").nextInt();
                total += matriz[i][j];
                if (i == 3) {
                    quartaLinha += matriz[i][j];
                }
                if (j == 1) {
                    segundaColuna += matriz[i][j];
                }
                if (i == j) {
                    diagonalPrincipal += matriz[i][j];
                }
                if ((i + j) == (matriz.length - 1)) {
                    diagonalSecundária += matriz[i][j];
                }
            }
            scan.nextLine();
        }

        System.out.println(quartaLinha);
        System.out.println(segundaColuna);
        System.out.println(diagonalPrincipal);
        System.out.println(diagonalSecundária);
        System.out.println(total);

    }

}
