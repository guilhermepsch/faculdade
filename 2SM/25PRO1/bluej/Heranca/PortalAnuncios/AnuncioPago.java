public class AnuncioPago extends Anuncio
{
    private int dias;
    private double valorPago;
    
    public AnuncioPago(String produto, double valorVenda, String cidade, String estado, int dias, double valorPago)
    {
        super(produto, valorVenda, cidade, estado);
        this.dias = dias;
        this.valorPago = valorPago;
    }
    
    public int getDias()
    {
        return this.dias;
    }
    
    public double getValorPago()
    {
        return this.valorPago;
    }
    
    public boolean setDias(int dias)
    {
        if (dias < 1){
            return false;
        }
        this.dias = dias;
        return true;
    }
    
    public boolean setValorPago(double valorPago)
    {
        if (valorPago < 1){
            return false;
        }
        this.valorPago = valorPago;
        return true;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s, Dias: %d, Valor Pago: %.2f", super.toString(), this.getDias(), this.getValorPago());
    }
}