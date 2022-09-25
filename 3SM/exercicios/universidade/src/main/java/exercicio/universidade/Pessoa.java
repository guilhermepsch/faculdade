package exercicio.universidade;

public abstract class Pessoa {
  
  private static int id = 0;
  private String nome;
  private String dataNascimento;
  private String cpf;

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

  public int getId(){
    return id;
  }

  public void incrementId()
  {
    id++;
  }
}
