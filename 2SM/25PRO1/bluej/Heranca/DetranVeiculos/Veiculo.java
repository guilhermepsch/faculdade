public class Veiculo
{
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valor;
    
    public Veiculo (String modelo, int ano, String placa, double valor)
    {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public String getPlaca()
    {
        return this.placa;
    }
    
    public double getValor()
    {
        return this.valor;
    }
    
    public boolean setModelo(String modelo)
    {
        if (!modelo.isBlank()){
            this.modelo = modelo;
            return true;
        }
        return false;
    }
    
    public boolean setAno(int ano)
    {
        if (ano > 1900){
            this.ano = ano;
            return true;
        }
        return false;
    }
    
    public boolean setPlaca(String placa)
    {
        if (!placa.isBlank()){
            this.placa = placa;
            return true;
        }
        return false;
    }
    
    public boolean setValor(double valor)
    {
        if (valor > 0){
            this.valor = valor;
            return true;
        }
        return false;
    }
    
    public double calculaIpva()
    {
        return this.valor*0.02;
    }
    
    public String toString()
    {
        return String.format("Modelo: %s, Ano: %d, Placa: %s, Valor: %.2f, IPVA: %.2f", this.getModelo(), this.getAno(), this.getPlaca(), this.getValor(), this.calculaIpva());
    }
}