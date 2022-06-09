import java.util.*;

public class Empresa
{
    private String cnpj;
    private String razaosocial;
    private List<Funcionario> funcionarios;
    
    public Empresa (String cnpj, String razaosocial)
    {
        this.cnpj = cnpj;
        this.razaosocial = razaosocial;
        funcionarios = new ArrayList();
    }
    
    public void addFuncionario(Funcionario func)
    {
        this.funcionarios.add(func);
    }
    
    public void imprimeFuncionarios()
    {
        System.out.println(this.razaosocial+" — "+ this.cnpj);
        for (Funcionario func : this.funcionarios){
            System.out.printf("%s — %s — %d%n", func.getNome(), func.getMatricula(), func.getSalarioMensal());
        }
    }
    
    public double getDespesasFolhasPagamento()
    {
        double count = 0;
        for (Funcionario func : this.funcionarios){
            count += func.getSalarioMensal();
        }
        return count;
    }
}