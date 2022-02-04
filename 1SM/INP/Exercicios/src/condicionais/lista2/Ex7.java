package condicionais.lista2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        System.out.println("Insira a posição vertical do primeiro ponto");
        int iPv1 = s.nextInt();
        System.out.println("Insira a posição horizontal do primeiro ponto");
        int iPh1 = s.nextInt();
        System.out.println("Insira a posição vertical do segundo ponto");
        int iPv2 = s.nextInt();
        System.out.println("Insira a posição horizontal do segundo ponto");
        int iPh2 = s.nextInt();
        double iDistancia = 0;

        // PROCESSAMENTO
        if (iPv1 > iPv2 || iPh1 > iPh2)
            System.out.println("A posição do ponto 1 não pode ser maior que a posição do ponto 2.");
        else {
            iDistancia = Math.sqrt(((iPv2 - iPv1)*(iPv2 - iPv1))+(iPh2 - iPh1)*(iPh2 - iPh1));
            System.out.println("A distância entre P1 e P2 é: "+ iDistancia);
        }
        s.close();

    }
}