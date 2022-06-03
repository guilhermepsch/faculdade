public class Estudante
{
    private String nome;
    private int matricula;
    private int creditos;
       
    public Estudante(int matricula)
    {
        this.matricula = matricula;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getMatricula()
    {
        return this.matricula;
    }
    
    public int getCreditos()
    {
        return this.creditos;
    }
    
    public boolean setNome(String nome)
    {
        if (!nome.isBlank()){
            this.nome = nome;
            return true;
        }
        return false;
    }
    
    public boolean adicionaCreditos(int creditos)
    {
        if (creditos > 0){
            this.creditos += creditos;
            return true;
        }
        return false;
    }
    
    public String getLogin()
    {
        return this.nome.substring(0, 3) + Integer.toString(this.matricula).substring(this.matricula.length() - 3);
    }
    
    public String toString()
    {
        String str = "Nome: "+this.nome+", Matrícula: "+this.matricula;
        str += ", Login: "+this.getLogin()+", Créditos "+this.creditos;
        return str;
    }
}