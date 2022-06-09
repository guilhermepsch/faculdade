public class Funcionario
{
    private int matricula;
    private String nome;
    private double salario;
    
    public Funcionario (int matricula)
    {
        this.matricula = matricula;
    }
    
    public boolean setNome(String nome)
    {
        if (!nome.isBlank()){
            this.nome = nome;
            return true;
        }
        return false;
    }
    
    public boolean setSalarioMensal(double salario)
    {
        if (salario > 1000){
            this.salario = salario;
            return true;
        }
        return false;
    }
    
    public int getMatricula()
    {
        return this.matricula;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public double getSalarioMensal()
    {
        return this.salario;
    }
}