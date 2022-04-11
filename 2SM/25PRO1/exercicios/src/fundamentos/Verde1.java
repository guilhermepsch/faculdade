package fundamentos;

import java.util.*;

public class Verde1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float raio = scan.nextFloat();
        float altura = scan.nextFloat();

        double volume = Math.PI*Math.pow(raio, 2)*altura;

        System.out.printf("%.2f%n",volume);
    }
}