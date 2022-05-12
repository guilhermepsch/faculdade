public class Pessoa
{
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    private Pessoa conjugue;
    
    public Pessoa (int anoNascimento)
    {
        this.anoNascimento = anoNascimento;
    }
    
    public boolean setNome(String nome)
    {
        if (!nome.isBlank()){
            this.nome = nome;
            return true;
        }
        return false;
    }
    
    public boolean setPeso(double peso)
    {
        if (peso > 0){
            this.peso = peso;
            return true;
        }
        return false;
    }
    
    public boolean setAltura(double altura)
    {
        if (altura > 0){
            this.altura = altura;
            return true;
        }
        return false;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    
    public double getAltura()
    {
        return this.altura;
    }
    
    public void casar(Pessoa outraPessoa)
    {
        if (this.conjugue == null && outraPessoa.conjugue == null)
        {
            this.conjugue = outraPessoa;
            outraPessoa.conjugue = this;
        }
    }
    
    public boolean ehCasado()
    {
        if (this.conjugue != null){
            return true;
        }
        return false;
    }
    
    public String getNomeConjugue()
    {
        return this.conjugue.nome;
    }
}