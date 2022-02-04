package repeticao.listafor;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        System.out.println("Insira um número.");
        int iNumero = s.nextInt();

        // PROCESSAMENTO
            for(int i = 1; i <= 10; i++){
                System.out.println(iNumero +" x "+ i +" = "+(iNumero*i));
            }
        s.close();

    }
}