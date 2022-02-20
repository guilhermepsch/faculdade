package funcoes.lista2;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira a massa inicial do material em gramas.");
        int numero = s.nextInt();

        System.out.println(calcula(numero));

    }

    public static String calcula(int numero) {
        int i;
        for (i = 0; numero > 0.5; i += 50) {
            numero = numero / 2;
        }
        int segundos = i % 60;
        int horas = i / 60;
        int minutos = horas % 60;
        horas = horas / 60;
        return "Foram necessários " + horas + " horas, " + minutos + " minutos, " + segundos + ", segundos até o material ficar com massa abaixo de 0,5g";
    }

}
