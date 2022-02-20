package funcoes.lista2;

import java.util.*;

public class Questao2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Indique o tipo de forma geométrica que você deseja calcular o volume. \n" +
                "1 - Cubo  \n" +
                "2 - Paralelepípedo \n" +
                "3 - Cilindros \n" +
                "4 - Esferas \n" +
                "5 - Cones");
        int opcao = s.nextInt();
        double resultado = 0;

        if (opcao == 1) {
            resultado = calculaCubo(s);
        } else if (opcao == 2) {
            resultado = calculaParalelepipedo(s);
        } else if (opcao == 3) {
            resultado = calculaCilindro(s);
        } else if (opcao == 4) {
            resultado = calculaEsfera(s);
        } else if (opcao == 5) {
            resultado = calculaCones(s);
        }
        System.out.println("O volume da forma informada é " + resultado);
    }

    public static double calculaCubo(Scanner s) {
        System.out.println("Insira o comprimento de um dos lados do cubo.");
        double comprimento = s.nextDouble();
        return Math.pow(comprimento, 3);
    }

    public static double calculaParalelepipedo(Scanner s) {
        System.out.println("Insira o comprimento do paralelepípedo.");
        double comprimento = s.nextDouble();
        System.out.println("Insira a largura do paralelepípedo.");
        double largura = s.nextDouble();
        System.out.println("Insira o altura do paralelepípedo.");
        double altura = s.nextDouble();
        return altura*comprimento*largura;
    }

    public static double calculaCilindro(Scanner s) {
        System.out.println("Insira o raio do cilintro");
        double raio = s.nextDouble();
        System.out.println("Insira a altura do cilindro.");
        double altura = s.nextDouble();
        return Math.PI* Math.pow(raio, 2)*altura;
    }

    public static double calculaEsfera(Scanner s) {
        System.out.println("Insira o raio da esfera");
        double raio = s.nextDouble();
        return (4.0/3.0)* Math.PI* Math.pow(raio,3);
    }

    public static double calculaCones(Scanner s) {
        System.out.println("Insira o raio do cone");
        double raio = s.nextDouble();
        System.out.println("Insira a altura do cone.");
        double altura = s.nextDouble();
        return (1.0/3.0)* Math.PI* Math.pow(raio,2)*altura;
    }

}
