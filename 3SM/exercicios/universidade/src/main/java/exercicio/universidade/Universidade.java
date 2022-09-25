package exercicio.universidade;

public class Universidade 
{

  private String nome;
  private String cnpj;

  public Universidade (String nome, String cnpj)
  {
    this.nome = nome;
    this.cnpj = cnpj;
  }

  public String getNome()
  {
    return this.nome;
  }

  public String getCnpj()
  {
    return this.cnpj;
  }

  public String toString()
  {
    return String.format("Nome: %s, CNPJ: %s", this.getNome(), this.getCnpj());
  }

}