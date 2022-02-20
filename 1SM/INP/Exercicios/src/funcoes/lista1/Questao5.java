package funcoes.lista1;

import java.text.DecimalFormat;

public class Questao5 {
	
	private static String transforma(int valor)
	{
		DecimalFormat df = new DecimalFormat("00");
		
		int hora = valor / 3600;
		int min = (valor % 3600);
		int sec = min % 60;
		min = min / 60;
		
		return df.format(hora) + ":" +df.format(min) + ":" + 
		       df.format(sec);
	}
	
	public static void main(String[] args) {
		System.out.println(transforma(60));

	}
}
