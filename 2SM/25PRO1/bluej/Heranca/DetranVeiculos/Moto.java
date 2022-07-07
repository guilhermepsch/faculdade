public class Moto extends Veiculo
{
    private int cilindradas;
    
    public Moto(String modelo, int ano, String placa, double valor, int cilindradas) {
        super(modelo,ano,placa,valor);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas()
    {
        return this.cilindradas;
    }
    
    public boolean setCilindradas(int cilindradas)
    {
        if (cilindradas > 0){
            this.cilindradas = cilindradas;
            return true;
        }
        return false;
    }
    
    @Override
    public double calculaIpva()
    {
        if (this.cilindradas > 200){
            return super.calculaIpva();
        }
        return 0;
    }
    
    @Override
    public String toString()
    {
        return String.format("Carro %s, Cilindradas: %d", super.toString(), this.getCilindradas());
    }
}