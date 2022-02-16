package lista1;

import java.util.Scanner;

public class Questao1 {
	
	private static double calculaVolume(double raio){
		return (((double)1/(double)3) * Math.PI * Math.pow(raio, 2) * 10);
	}

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		
		System.out.println("CALCULO DE VOLUME");
		System.out.println("Informe o valor do raio");
		double raio = s.nextDouble();
		
		double volume = calculaVolume(raio);
		
		System.out.println("O volume calculado é: " + volume);
*/
		System.out.println("O volume calculado é: " + calculaVolume(3));
	}

}
