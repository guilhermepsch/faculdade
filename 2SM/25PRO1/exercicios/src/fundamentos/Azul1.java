package fundamentos;

import java.util.*;

public class Azul1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        int horas = scan.nextInt();
        double valorhora = scan.nextDouble();
        int filhos = scan.nextInt();

        double salariofinal = (valorhora * horas) + ((valorhora * horas) / 100) * (3 * filhos);

        System.out.print(nome+": "+String.format("%.2f%n", salariofinal));
    }
}