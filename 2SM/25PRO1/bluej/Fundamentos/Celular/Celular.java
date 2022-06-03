// Guilherme Pereira Schneidt
public class Celular
{
   private String numero;
   private double creditoDisponivel;
   private double cobradoPorMinuto;
   private double totalConsumido;
   private int totalMinutos;
   
   public Celular(String numero)
   {
       this.numero = numero;
   }
   
   public boolean setCobranca(double valor)
   {
       if (valor > 0){
           this.cobradoPorMinuto = valor;
           return true;
       }
       return false;
   }
   
   public boolean addCredito (double valor)
   {
       if (valor > 0){
           this.creditoDisponivel += valor;
           return true;
       }
       return false;
   }
   
   public boolean registraLigacao(String numero, int minutos)
   {
       double cobradoPorMinuto = this.cobradoPorMinuto;
       if (numero.substring(0, 2).equals(this.numero.substring(0, 2))){
           cobradoPorMinuto += cobradoPorMinuto*0.25;
       }
       
       if (minutos*cobradoPorMinuto <= this.creditoDisponivel){
           this.creditoDisponivel = creditoDisponivel - (minutos*cobradoPorMinuto);
           this.totalConsumido += (minutos*cobradoPorMinuto);
           this.totalMinutos += minutos;
           return true;
       }
       return false;
   }
   
   public String toString()
   {
       String[] arrayValores = { 
           this.numero, 
           Double.toString(this.cobradoPorMinuto), 
           Double.toString(this.creditoDisponivel), 
           Double.toString(this.totalConsumido), 
           Integer.toString(this.totalMinutos)
        };
       return String.format("Número: %s, Valor minuto: %s, Crédito disponível: %s, Crédito consumido: %s, Minutos ligações: %s", arrayValores);
   }
}
