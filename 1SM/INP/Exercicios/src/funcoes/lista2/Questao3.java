package funcoes.lista2;

import java.util.*;

public class Questao3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o número");
        int numero = s.nextInt();

        System.out.println(calculaPerfeito(numero));

    }

    public static String calculaPerfeito(int numero){


        int soma = 0;
        for (int i = 1; i < numero; i++){
            if (numero%i == 0){
                soma += i;
            }
        }
        if (numero == soma){
            return "O número informado é perfeito.";
        }
        return "O número informado é imperfeito.";
    }

}
