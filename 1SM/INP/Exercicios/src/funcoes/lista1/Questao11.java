package funcoes.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao11 {
	
	public static double pesoIdeal(double altura, String sexo){
		if(sexo.equalsIgnoreCase("M")){
			return (72.7 * altura) - 58;
		}else{
			if(sexo.equalsIgnoreCase("F")){
				return (62.1 * altura) - 44.7;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		
		DecimalFormat df = new DecimalFormat("0.##");
		Scanner s = new Scanner(System.in);
				
		System.out.println("Informe a altura");
		double altura = s.nextDouble();
		System.out.println("Informe o sexo");
		String sexo = s.next();
		System.out.println("Peso ideal : " + df.format(pesoIdeal(altura, sexo)));
	}

}
