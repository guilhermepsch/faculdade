package condicionais.lista2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex3 {
    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);
        

        // LEITURA DA DATA

        System.out.println("Informe sua data de nascimento (EX: 16/05/2002");
        String sData = s.next();

        // PROCESSAMENTO
        
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	    Date dData = data.parse(sData);

        Date dDataAtual = java.util.Calendar.getInstance().getTime();

        long diff = dDataAtual.getTime() - dData.getTime();
        System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));

        s.close();

    }
}