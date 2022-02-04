package repeticao.listafor;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        int iNegativos = 0;

        // PROCESSAMENTO
            for(int i = 1; i <= 5; i++){
                System.out.println("Insira um número.");
                int iNumero = s.nextInt();
                if(iNumero < 0){
                    iNegativos++;
                }
            }
            System.out.println("Dos números mencionados, "+iNegativos+" são negativos.");

        s.close();

    }
}