package funcoes;

import java.util.Scanner;

public class Questao8 {
	
	public static boolean positivo(int valor){
		if(valor < 0)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o valor");
		int valor = s.nextInt();
		
		if (positivo(valor))
			System.out.println("O valor informado � positivo");
		else
			System.out.println("O valor informado � negativo");
	}

}
