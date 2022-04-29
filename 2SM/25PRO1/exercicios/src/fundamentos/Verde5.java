package fundamentos;

import java.util.*;

public class Verde5 {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        String tipo = scan.useDelimiter(";").next();
        double area = 0;

        switch (tipo) {
            case "Q":
                double lado = scan.nextDouble();
                area = areaQuadrado(lado);
                break;
            case "R":
                double base = scan.nextDouble();
                double altura = scan.nextDouble();
                area = areaRetangulo(base, altura);
                break;
            case "C":
                double raio = scan.nextDouble();
                area = areaCirculo(raio);
                break;
            case "T":
                double lado1 = scan.nextDouble();
                double lado2 = scan.nextDouble();
                double lado3 = scan.nextDouble();
                area = areaTriangulo(lado1, lado2, lado3);
                break;
        }
        System.out.printf("%.2f", area);
    }

    public static double areaQuadrado(double lado)
    {
        return Math.pow(lado, 2);
    }

    public static double areaRetangulo(double base, double altura)
    {
        return base * altura;
    }

    public static double areaCirculo(double raio)
    {
        return Math.PI * (Math.pow(raio, 2));
    }

    public static double areaTriangulo(double lado1, double lado2, double lado3)
    {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

}
