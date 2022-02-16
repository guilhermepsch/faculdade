package funcoes;

import java.util.Scanner;

public class Questao13 {
	public static int calculaFatorial(int valor){
		
		int fatorial = 1;
		for(int i = valor;i > 0;i--){
			fatorial *= i; 
		}
		return fatorial;
	}
	
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o valor");
		int valor = s.nextInt();
		System.out.println("Fatorial:  " + calculaFatorial(valor));
	}

}
