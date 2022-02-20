package funcoes.lista1;

import java.util.Scanner;

public class Questao6 {

	public static int calcula(int anos, int meses, int dias){
		return dias + (meses * 30) + (anos * 365);
	}

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantos anos vc tem?");
		int anos  = s.nextInt();
		System.out.println("Quantos meses?");
		int meses  = s.nextInt();
		System.out.println("Quantos dias?");
		int dias  = s.nextInt();
		System.out.println("Dias de vida: " + 
		                    calcula(anos, meses, dias));
	}	
}
