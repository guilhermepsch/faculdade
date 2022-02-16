package funcoes;

import java.util.Scanner;

public class Questao14 {

	public static String tabuada(int n){
		String tabuada = "";
		for(int i = 1;i <= n;i++){
			for(int x = 1;x <= 10;x++){
				tabuada += String.valueOf(i) + " x " + String.valueOf(x) + " = " + String.valueOf(i*x) + "\n"; 
			}
			tabuada += "\n";
		}
		return tabuada;
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o tipo de tabuada a calcular");
		int n  = s.nextInt();
		System.out.println("\n" + tabuada(n));
	}
}
