package fundamentos;

import java.util.*;

public class Verde2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double avalor = scan.nextDouble();
        double bvalor = scan.nextDouble();
        double cvalor = scan.nextDouble();

        double delta = Math.pow(bvalor, 2) + (-4 * avalor * cvalor);

        if (delta >= 0) {
            double xpositivo = (-bvalor + Math.sqrt(delta)) / (2 * avalor);
            System.out.printf("%.2f", xpositivo);
            if (delta != 0) {
                System.out.print(";");
                System.out.printf("%.2f", (-bvalor - Math.sqrt(delta)) / (2 * avalor));
            }
        } else {
            System.out.println("Sem raiz real");
        }
    }
}