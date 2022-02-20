package funcoes.lista1;

import java.util.Scanner;

public class Questao2 {
	
	private static double calculaMedia(double nota1, double nota2,
			                           double nota3, String tipoCalculo)
	{
		if (tipoCalculo.equalsIgnoreCase("A"))
			return (nota1+nota2+nota3)/3;
		else
			return nota1*0.5 + nota2*0.3 + nota3*0.2;
	}
	
	private static String defineSituacao(double media)
	{
		if (media < 5)
			return "Reprovado";
		else
			if (media >= 7)
				return "Aprovado";
			else
				return "Em exame";
			
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("PROGRAMA CALCULO DE MEDIA");
		System.out.println("Informe o a nota 1");
		double n1 = s.nextDouble();
		System.out.println("Informe o a nota 2");
		double n2 = s.nextDouble();
		System.out.println("Informe o a nota 3");
		double n3 = s.nextDouble();
		System.out.println("Informe o tipo de m�dia");
		System.out.println("A-Aritmetica    P-Ponderada");
		String tipo = s.next();
		while (!tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("P")){
			System.out.println("Tipo Incorreto!! Informe o tipo de m�dia");
			System.out.println("A-Aritmetica    P-Ponderada");
			tipo = s.next();
		}
		double media = calculaMedia(n1, n2, n3, tipo);
		System.out.println("A m�dia �: " + media);
		
		String situacao = defineSituacao(media);
		System.out.println("Sua situa��o  �: " + situacao);
		
	}
}
