public class Time
{
    private String nome;
    private int anoFund;
    private String cidade;
    private Treinador treinador;
    
    public Time(String nome, int anoFund, String cidade)
    {
        this.nome = nome;
        this.anoFund = anoFund;
        this.cidade = cidade;
    }
    
    public void setTreinador(Treinador treinador)
    {
        this.treinador = treinador;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getAnoFund()
    {
        return this.anoFund;
    }
    
    public String getCidade()
    {
        return this.cidade;
    }
    
    public String toString()
    {
        return String.format("Time: %s Ano de Fundação: %d Cidade: %s Treinador: %s",
        this.nome, this.anoFund, this.cidade, this.treinador.getNome());
    }
}