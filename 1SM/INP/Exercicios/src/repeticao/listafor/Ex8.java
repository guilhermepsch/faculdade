package repeticao.listafor;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // LEITURA DA DATA

        int iMedia = 0;
        int iBom = 0;
        int iExcel = 0;

        // PROCESSAMENTO
        for (int i = 1; i <= 50; i++) {
            System.out.println("Insira a nota do primeiro bimestre.");
            double iBimestre1 = s.nextDouble();
            System.out.println("Insira a nota do segundo bimestre.");
            double iBimestre2 = s.nextDouble();

            if (iMedia >= 7 && iMedia < 8){
                iBom++;
            }
            if (iMedia > 9 && (iBimestre1 == 10 && iBimestre2 == 10)){
                iExcel++;
            }
        }

        System.out.println(" Números de pessoas com bom aproveitamento: "+iBom+"\n Porcentagem de alunos excelentes: "+(iExcel*2)+"%");

        s.close();
    }
}