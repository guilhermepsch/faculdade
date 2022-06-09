import java.util.*;

public class Banco
{
    private int codigo;
    private String nome;
    private List<Agencia> agencias;
    
    public Banco (int codigo, String nome)
    {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public boolean setNome(String nome)
    {
        if (!nome.isBlank()){
            this.nome = nome;
            return true;
        }
        return false;
    }
    
    public void imprimeAgencia()
    {
        System.out.printf("%s — %d%nAgências", this.nome, this.codigo);
        for (Agencia agencia : this.agencias){
            System.out.printf("%d — %s — %d%n", agencia.getNumero(), agencia.getCidade(), agencia.getAno());
        }
    }
    
    public void imprimeAgencia(String cidade)
    {
        System.out.printf("%s — %d%nAgências", this.nome, this.codigo);
        for (Agencia agencia : this.agencias){
            if (agencia.getCidade().equals(cidade)){
                System.out.printf("%d — %s — %d%n", agencia.getNumero(), agencia.getCidade(), agencia.getAno());
            }
        }
    }
    
    public void imprimeAgencia(int ano)
    {
        System.out.printf("%s — %d%nAgências", this.nome, this.codigo);
        for (Agencia agencia : this.agencias){
            if (agencia.getAno() == ano){
                System.out.printf("%d — %s — %d%n", agencia.getNumero(), agencia.getCidade(), agencia.getAno());
            }
        }
    }
    
    public Agencia getAgencia(int numero)
    {
        for (Agencia agencia : this.agencias){
            if (agencia.getNumero() == numero){
                return agencia;
            }
        }
        return null;
    }
}