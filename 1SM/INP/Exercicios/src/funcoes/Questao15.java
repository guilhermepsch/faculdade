package funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao15 {
	
	public static double calcualaS(int n){
		double soma = 0.0;
		for(int i = 1;i <= n;i++){
			soma += (double)1/(double)i;
		}
		return soma;
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		
		System.out.println("Informe o valor de N");
		int n = s.nextInt();
		System.out.println("S == " + df.format(calcualaS(n)));
	}

}
