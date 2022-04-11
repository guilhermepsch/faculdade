package fundamentos;

import java.util.*;

public class Amarelo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        int horas = scan.nextInt();
        double valorhora = scan.nextDouble();
        int filhos = scan.nextInt();

        double salarioBruto = (valorhora * horas) + ((valorhora * horas) / 100) * (3 * filhos);

        double descontoIR = calcularIR(salarioBruto);
        double descontoINSS = calcularINSS(salarioBruto);
        double salarioLiquido = salarioBruto - (descontoINSS + descontoIR);

        System.out.print(nome+";");
        System.out.print(String.format("%.2f",salarioBruto)+";");
        System.out.print(String.format("%.2f",descontoINSS)+";");
        System.out.print(String.format("%.2f",descontoIR)+";");
        System.out.print(String.format("%.2f",salarioLiquido)+";");
    }

    public static double calcularINSS(double salarioBruto){
        if (salarioBruto > 1000){
            return (salarioBruto/100)*9;
        } else {
            return (salarioBruto/100)*8.5;
        }
    }

    public static double calcularIR(double salarioBruto){

        if (salarioBruto > 1000){
            return (salarioBruto/100)*7;
        } else if (salarioBruto > 500){
            return (salarioBruto/100)*5;
        } else{
            return 0.0;
        }

    }

}