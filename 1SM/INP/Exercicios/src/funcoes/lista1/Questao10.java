package funcoes.lista1;

import java.util.Scanner;

public class Questao10 {
	
	public static String conceito(double media){
		if(media >= 0 && media <= 4.9)
			return "D";
		else
			if(media >= 5 && media <= 6.9)
				return "C";	
			else
				if(media >= 7 && media <= 8.9)
					return "B";
				else
					if(media >= 9 && media <= 10)
						return "A";
		return "N�o foi possivel definir o coneceito";
	}
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		double media;
		
		System.out.println("Informe a m�dia");
		media = s.nextDouble();
		System.out.println("Conceito :" + conceito(media));
	}
}
