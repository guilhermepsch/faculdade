// Guilherme Pereira Schneidt
public class ExecutaMain
{
   public static void main(String[] args)
   {
       Celular cel1 = new Celular("47999998765");
       cel1.setCobranca(0.99);
       cel1.addCredito(20.00);
   
       Celular cel2 = new Celular("49987654321");
       cel2.setCobranca(1.25);
       cel2.addCredito(50.00);
       
       
       cel1.toString();
       cel1.registraLigacao("47922223333", 5);
       cel1.registraLigacao("51988776655", 10);
       cel1.toString();
       cel1.registraLigacao("47922223333", 10);
       cel1.toString();
       cel1.setCobranca(0.25);
       cel1.registraLigacao("47922223333", 10);
       cel1.registraLigacao("51988776655", 5);
       cel1.toString();
       
       cel2.toString();
       cel2.registraLigacao("4990901122", 30);
       cel2.registraLigacao("47988665544", 7);
       cel2.toString();
       cel2.addCredito(25.50);
       cel2.registraLigacao("47988665544", 20);
       cel2.toString();
   }
}
