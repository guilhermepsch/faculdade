public class Autor
{
    private String nome;
    private String pseudonimo;
    
    public Autor(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getPseudonimo()
    {
        return this.pseudonimo;
    }
    
    public boolean setPseudonimo(String pseudonimo)
    {
        if (!pseudonimo.isBlank()){
            this.pseudonimo = pseudonimo;
            return true;
        }
        return false;
    }
    
}