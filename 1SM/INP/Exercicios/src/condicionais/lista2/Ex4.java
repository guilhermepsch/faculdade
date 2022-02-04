package condicionais.lista2;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex4 {
    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        System.out.println("Informe a quantidade de dias (EX: 6500");
        int iData = s.nextInt();

        // PROCESSAMENTO

        long lData = TimeUnit.MILLISECONDS.convert(iData, TimeUnit.DAYS);
        Date dDataAtual = java.util.Calendar.getInstance().getTime();
        long diff = dDataAtual.getTime() - lData;

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(diff);

        int mYear = calendar.get(Calendar.YEAR);
        int mMonth = calendar.get(Calendar.MONTH);
        int mDay = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(mDay + "/" + mMonth + "/" + mYear);

        s.close();

    }
}