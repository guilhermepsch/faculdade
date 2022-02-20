package funcoes.lista1;

import java.util.Scanner;

public class Questao3 {
	
	private static boolean numeroPrimo(int num)
	{
		if (num  < 2)
			return false;
		for (int x = 2; x < num; x++)
			if (num % x == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor = s.nextInt();
		boolean ehNumeroPrimo = numeroPrimo(valor);
		if(ehNumeroPrimo)
			System.out.println("É primo");
		else
			System.out.println("Nao é primo");
	}
}
