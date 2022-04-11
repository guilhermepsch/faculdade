package fundamentos;

import java.util.*;

public class Amarelo3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maior = scan.nextInt();
        int menor = scan.nextInt();
        int restante = 1;

        while (restante != 0) {
            restante = maior % menor;
            if (restante == 0) {
                System.out.println(menor);
            } else {
                maior = menor;
                menor = restante;
            }
        }

    }
}