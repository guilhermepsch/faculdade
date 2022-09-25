package exercicio.universidade;

public abstract class Pessoa {
  
  private static int id = 0;
  protected String nome;
  protected String dataNascimento;
  protected String cpf;

  public Pessoa (String nome, String dataNascimento, String cpf)
  {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
  }

  public String getNome()
  {
   return this.nome;
  }

  public String getDataNascimento()
  {
   return this.dataNascimento;
  }

  public String getCpf()
  {
   return this.cpf;
  }

  protected static int getId(){
    return id;
  }

  protected static void incrementId()
  {
    id++;
  }
}
