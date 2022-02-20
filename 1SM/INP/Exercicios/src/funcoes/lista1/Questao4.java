package funcoes.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao4 {
	public static String baskara(int a, int b, int c){
		DecimalFormat df = new DecimalFormat("0.##");
		double delta = Math.sqrt((Math.pow(b, 2)) - (4 * a * c));

		if(delta >= 0){
			double x1 = ((-b) + delta) / (2 * a);
			double x2 = ((-b) - delta) / (2 * a);
			return "r1: " + df.format(x1) + " r2: " + df.format(x2);
			
		}
		else
			return "Delta negativo - nenhuma raiz real";
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o valor de 'a'");
		int a = s.nextInt();
		System.out.println("Informe o valor de 'b'");
		int b = s.nextInt();
		System.out.println("Informe o valor de 'c'");
		int c = s.nextInt();
		System.out.println(baskara(a, b, c));
	}
}
