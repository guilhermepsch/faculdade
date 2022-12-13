package questao3.model;

public class Funcionario {

  private String nome;
  private String cargo;
  private String dataDeAdmissao;
  private String matricula;

  public Funcionario(String nome, String cargo, String dataDeAdmissao) {
    this.nome = nome;
    this.cargo = cargo;
    this.dataDeAdmissao = dataDeAdmissao;
    this.matricula = this.generateMatricula();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getDataDeAdmissao() {
    return dataDeAdmissao;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public String generateMatricula() {
    return this.getNome().substring(0, 3) + this.getDataDeAdmissao().substring(0, 3) + this.getCargo().substring(0, 3);
  }

  @Override
  public String toString() {
    return "Funcionario [cargo=" + cargo + ", dataDeAdmissao=" + dataDeAdmissao + ", matricula=" + matricula + ", nome="
        + nome + "]";
  }

}
