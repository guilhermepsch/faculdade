public class Anuncio
{
    protected String produto;
    protected double valorVenda;
    protected String cidade;
    protected String estado;
    
    public Anuncio(String produto, double valorVenda, String cidade, String estado)
    {
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public boolean setProduto(String produto)
    {
        if (!produto.isBlank()){
            this.produto = produto;
            return true;
        }
        return false;
    }
    
    public boolean setValorVenda(double valorVenda)
    {
        if (valorVenda > 0){
            this.valorVenda = valorVenda;
            return true;
        }
        return false;
    }
    
    public boolean setCidade(String cidade)
    {
        if (!cidade.isBlank()){
            this.cidade = cidade;
            return true;
        }
        return false;
    }
    
    public boolean setEstado(String estado)
    {
        if (!estado.isBlank()){
            this.estado = estado;
            return true;
        }
        return false;
    }
    
    public String getProduto()
    {
        return this.produto;
    }
    
    public double getValorVenda()
    {
       return this.valorVenda; 
    }
    
    public String getCidade()
    {
        return this.cidade;
    }
    
    public String getEstado()
    {
        return this.estado;
    }
    
    public String toString()
    {
        return String.format("Produto: %s, Valor Venda: %.2f, Cidade: %s, Estado: %s", this.getProduto(), this.getValorVenda(),this.getCidade(), this.getEstado());
    }
}