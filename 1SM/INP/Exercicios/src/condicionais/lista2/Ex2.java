package condicionais.lista2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA IDADE

        String sRetorno = "";
        String asUnidade[] = { "", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez",
                "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete", "Dezoito", "Dezenove" };
        String asDezena[] = { "", "", "Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta",
                "Noventa" };
        String asCentena[] = { "", "Cento e " };

        System.out.println("Informe a sua Idade. (ex: 20)");
        int iIdade = s.nextInt();

        // PROCESSAMENTO
        if (iIdade > 199) {
            System.out.println("Idade inválida");
        } else {

            int iCentena = iIdade / 100;
            int iDezena = iIdade / 10;
            int iUnidade = iIdade % 10;

            if (iIdade > 100)
                iDezena = iDezena - 10;

            if (iIdade < 20) {
                sRetorno = asUnidade[iIdade];
            } else if (iIdade == 100) {
                sRetorno = ("Cem");
            } else {
                if (iDezena > 2 && iUnidade != 0) {
                    sRetorno = asCentena[iCentena] + asDezena[iDezena] + " e " + asUnidade[iUnidade];
                } else {
                    sRetorno = asCentena[iCentena] + asDezena[iDezena] + asUnidade[iUnidade];
                }
            }
            System.out.println(sRetorno + " anos");
        }
        s.close();

    }
}