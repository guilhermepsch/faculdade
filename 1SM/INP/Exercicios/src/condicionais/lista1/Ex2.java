package condicionais.lista1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA E VALIDAÇÃO DE ALTURA E PESO
        System.out.println("Informe sua altura em metros (Ex: 1.60)");
        double alt = s.nextDouble();
        System.out.println("Informe seu peso em KG (Ex: 68.2");
        double pes = s.nextDouble();
        boolean verificaAltura = true;
        boolean verificaPeso = true;

        if (alt < 0 || alt > 2.51) {
            System.out.println("Altura informada se encontra inválida.");
            verificaAltura = false;
        }
        if (pes < 0 || pes > 500) {
            System.out.println("Peso informado se encontra inválido.");
            verificaPeso = false;
        }

        // REALIZAÇÃO DO CÁLCULO DO IMC
        if (verificaAltura && verificaPeso) {
            double imc = pes / (alt * alt);
            System.out.println("Seu IMC é: " + imc);
            if (imc < 20) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc > 19 && imc < 25) {
                System.out.println("Você está em peso normal.");
            } else if (imc > 24 && imc < 30) {
                System.out.println("Você está em sobre peso.");
            } else if (imc > 29 && imc < 40) {
                System.out.println("Você está obeso.");
            } else if (imc > 39) {
                System.out.println("Você está em obesidade mórbida.");
            }
        }

        s.close();
    }
}
