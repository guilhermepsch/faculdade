package questao1;

abstract public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;
  private String telefone;
  private int matricula;

  public Pessoa(String nome, String cpf, String endereco, String telefone, int matricula) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.telefone = telefone;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", cpf='" + cpf + '\'' +
        ", endereco='" + endereco + '\'' +
        ", telefone='" + telefone + '\'' +
        ", matricula=" + matricula +
        '}';
  }
}