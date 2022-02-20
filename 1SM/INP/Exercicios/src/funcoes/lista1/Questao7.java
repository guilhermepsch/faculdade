package funcoes.lista1;

import java.util.Scanner;

public class Questao7 {
	public static String categoria(int idade){
		if(idade >= 5 && idade <= 7)
			return "Infantil A";
		else if(idade >= 8 && idade <= 10)
				return "Infantil B";
			else if(idade >= 11 && idade <= 13)
					return "Juvenil A";
				else if(idade >= 14 && idade <= 17)
						return "Juvenil B";
					else if(idade >= 18)
							return "Adulto";
						
		return "N�o foi poss�vel definir a categoria";
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a idade");
		int idade = s.nextInt();
		System.out.println("Categoria: " + categoria(idade));
	}

}
