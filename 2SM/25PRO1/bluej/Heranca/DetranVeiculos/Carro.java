public class Carro extends Veiculo
{
    private int portas;
    private boolean alugado;
    
    public Carro(String modelo, int ano, String placa, double valor, int portas, boolean alugado) {
        super(modelo,ano,placa,valor);
        this.portas = portas;
        this.alugado = alugado;
    }
    
    public int getPortas()
    {
        return this.portas;
    }
    
    public boolean setPortas(int portas)
    {
        if (portas > 0){
            this.portas = portas;
            return true;
        }
        return false;
    }
    
    public boolean getAlugado()
    {
        return this.alugado;
    }
    
    public boolean setAlugado(boolean alugado)
    {
        this.alugado = alugado;
        return true;
    }
    
    @Override
    public double calculaIpva()
    {
        if (!this.alugado){
            return super.calculaIpva();
        }
        return super.calculaIpva()/2;
    }
    
    @Override
    public String toString()
    {
        return String.format("Carro %s, Portas: %d", super.toString(), this.getPortas());
    }
}