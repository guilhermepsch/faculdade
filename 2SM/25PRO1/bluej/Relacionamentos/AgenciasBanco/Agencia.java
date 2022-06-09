public class Agencia
{
    private int numero;
    private String cidade;
    private int ano;
    
    public Agencia(int numero, String cidade, int ano)
    {
        this.numero = numero;
        this.cidade = cidade;
        this.ano = ano;
    }
    
    public int getNumero()
    {
        return this.numero;
    }
    
    public String getCidade()
    {
        return this.cidade;
    }
    
    public int getAno()
    {
        return this.ano;
    }
}