package fundamentos;

import java.util.*;

public class Azul2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        double salario = scan.nextDouble();
        double emprestimo = scan.nextDouble();

        if (emprestimo <= salario*5){
            System.out.print(nome + "\nFinanciamento CONCEDIDO\nObrigado por nos Consultar");
        } else {
            System.out.print(nome + "\nFinanciamento NEGADO\nObrigado por nos Consultar");
        }

    }

}
