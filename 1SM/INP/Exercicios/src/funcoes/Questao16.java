package funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao16 {
	
	public static int calculaFatorial(int valor){
		
		int fatorial = 1;
		for(int i = valor;i > 0;i--){
			fatorial *= i; 
		}
		return fatorial;
	}
	
	public static double calcualaS(int n){
		double soma = 0.0;
		for(int i = 1;i <= n;i++){
			int fatorial = 1;
			for(int x = i;x >= 1;x--){
				fatorial *= x; 
			}
			soma += (double)1/(double)calculaFatorial(i);
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
