public class Participante {
    
    private String nome;
    private int telefone;
    
    public Participante (String nome, int telefone)
    {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getTelefone()
    {
        return this.telefone;
    }
}