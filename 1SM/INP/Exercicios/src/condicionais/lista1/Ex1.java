package condicionais.lista1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DO NUMERO
        System.out.println("Informe o número.");
        int n1 = s.nextInt();

        // PROCESSAMENTO

        boolean verificaDivisao = false;
        if(n1%10 == 0){
            System.out.println("O número informado é divisível por 10");
            verificaDivisao = true;
        }
        if(n1%5 == 0){
            System.out.println("O número informado é divisível por 5");
            verificaDivisao = true;
        }
        if(n1%2 == 0){
            System.out.println("O número informado é divisível por 2");
            verificaDivisao = true;
        }
        if(!verificaDivisao){
            System.out.println("O número informado não é divisível por 10, 5 ou 2");
        }
        s.close();
    }
}
