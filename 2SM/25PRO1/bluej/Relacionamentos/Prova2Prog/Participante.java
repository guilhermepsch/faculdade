// Guilherme Pereira Schneidt

public class Participante 
{
    private String nome;
    private int idade;
    private String cidade;
    
    public Participante (String nome, int idade, String cidade)
    {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    
    public boolean setCidade(String cidade)
    {
        if (!cidade.isBlank()){
            this.cidade = cidade;
            return true;
        }
        return false;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public String getCidade()
    {
        return this.cidade;
    }
    
    public String toString()
    {
        return String.format("Nome: %s, Idade: %d, Cidade: %s", this.nome, this.idade, this.cidade);
    }
}