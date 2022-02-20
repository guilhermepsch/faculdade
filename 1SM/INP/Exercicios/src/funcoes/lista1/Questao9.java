package funcoes.lista1;

import java.util.Scanner;

public class Questao9 {
	
	public static boolean par(int valor){
		if(valor % 2 == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o valor");
		int valor = s.nextInt();
		if (par(valor))
			System.out.println("O numero informado � par");
		else
			System.out.println("O numero informado � �mpar");
	}

}
