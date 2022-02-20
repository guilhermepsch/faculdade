package funcoes.lista1;

import java.util.Scanner;

public class Questao12 {
	public static String triangulo(double x, double y, double z){
		
		boolean trianguloValido = false;
		
		if ((x < (y + z)) || (y < (x + z)) || (z < (x + y))){
			trianguloValido = true;
		}

		
		if(trianguloValido){
			if(x == y && x == z && y == z)
				return "Equilátero";
			else
				if(x != y && x != z && y != z)
					return "Escaleno";
				else
					if(x == y || x == z || y == z)
						return "Isóceles";
				
		}
		else 
			return "As medidas n�o formam um tri�ngulo";
		
		return "N�o foi possivel definir o tipo de tri�ngulo";
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("X -> ");
		double x = s.nextInt();
		System.out.print("Y -> ");
		double y = s.nextInt();
		System.out.print("Z -> ");
		double z = s.nextInt();
		System.out.println("O triangulo é == " + triangulo(x, y, z));
	}

}
