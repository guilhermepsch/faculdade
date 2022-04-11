package fundamentos;

import java.util.*;

public class Azul3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int menorIdade = 1000;
        String menorIdadeNome = "";
        int quantidade = 0;
        double mediaIdade = 0;
        double feminino = 0;
        int nascidosIbirama = 0;

        boolean condicao = true;

        for (int i = 0; condicao; i++) {

            String nome = scan.nextLine();
            if (nome.equals("fim")) {
                condicao = false;
                double porcentagem = 0;
                if (feminino != 0) {
                    porcentagem = (feminino * 100) / i;
                }

                String percent = String.format("%.2f", porcentagem);

                System.out.println("Menor idade: " + menorIdadeNome);
                System.out.println("Quantidade 18-20: " + quantidade);
                System.out.println("Média idade: " + String.format("%.2f", (mediaIdade / i)));
                System.out.println("Percentual feminino: " + percent);
                System.out.println("Nascidos em Ibirama: " + nascidosIbirama);
                continue;
            }
            int idade = scan.nextInt();
            String sexo = scan.next();
            scan.nextLine();
            String cidade = scan.nextLine();

            if (idade < menorIdade) {
                menorIdade = idade;
                menorIdadeNome = nome;
            }
            if (idade >= 18 && idade <= 20) {
                quantidade++;
            }
            if (sexo.equals("F")) {
                feminino++;
            }
            if (cidade.equals("Ibirama")) {
                nascidosIbirama++;
            }
            mediaIdade += idade;
        }

    }

}
