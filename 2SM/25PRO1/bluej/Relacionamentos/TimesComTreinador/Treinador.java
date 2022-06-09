public class Treinador
{
    private String cpf;
    private String nome;
    private double salario;
    
    public Treinador(String cpf, String nome)
    {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public boolean setSalario(double salario)
    {
        if (salario > 0){
            this.salario = salario;
            return true;
        }
        return false;
    }
    
    public String getCpf()
    {
        return this.cpf;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public double getSalario()
    {
        return this.salario;
    }
}