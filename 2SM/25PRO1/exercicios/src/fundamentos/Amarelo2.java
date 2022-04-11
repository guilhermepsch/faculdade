package fundamentos;

import java.util.*;

public class Amarelo2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String operador = scan.next();
        double ptermo = scan.nextDouble();
        double stermo = 0;
        double resultado = 0;

        if (!operador.equals("abs")) {
            stermo = scan.nextDouble();
        }

        switch (operador) {
            case "sum":
                resultado = ptermo + stermo;
                break;
            case "sub":
                resultado = ptermo - stermo;
                break;
            case "mult":
                resultado = ptermo * stermo;
                break;
            case "div":
                resultado = ptermo / stermo;
                break;
            case "abs":
                resultado = Math.abs(ptermo);
                break;
        }
        if (stermo == 0 && operador.equals("div")) {
            System.out.println("Divisão por zero");
        } else {
            System.out.printf("%.1f", resultado);
        }
    }

}
