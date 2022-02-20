package funcoes.lista2;

import java.util.*;

public class Questao1 {

    public static void main(String[] args) {

        int cont = 0;
        int[] numero = new int[30];
        boolean continua = true;

        while (cont < 30 && continua) {

            numero[cont] = perguntaNumero();
            continua = perguntaContinua();
            cont++;
        }
        somaPares(numero);
        contaNegativos(numero);
        somaIntervalo(numero);
    }

    public static int perguntaNumero() {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número inteiro positivo ou negativo.");
        int numero = s.nextInt();
        return numero;
    }

    public static boolean perguntaContinua() {
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja informar outro número? 1 - Y/ 2 - N");
        int input = s.nextInt();
        if (input == 2) {
            return false;
        }
        return true;
    }

    public static void somaPares(int[] numero) {
        int cont = 0;
        int somaPares = 0;
        while (cont < numero.length) {
            if (numero[cont] % 2 == 0) {
                somaPares += numero[cont];
            }
            cont++;
        }
        System.out.println("A soma dos pares é " + somaPares);
    }

    public static void somaIntervalo(int[] numero) {
        int cont = 0;
        int somaIntervalo = 0;
        while (cont < numero.length) {
            if (numero[cont] < 26 && numero[cont] > 0) {
                somaIntervalo += numero[cont];
            }
            cont++;
        }
        System.out.println("A soma dos números entre 1 e 25 é " + somaIntervalo);
    }

    public static void contaNegativos(int[] numero) {
        int cont = 0;
        int contaNegativos = 0;
        while (cont < numero.length) {
            if (numero[cont] < 0) {
                contaNegativos++;
            }
            cont++;
        }
        System.out.println("O número de números negativos é " + contaNegativos);
    }
}

