package questao1;

public class Professor extends Pessoa {
  private String departamento;
  private String titulacao;

  public Professor(String nome, String cpf, String endereco, String telefone, int matricula, String departamento, String titulacao) {
    super(nome, cpf, endereco, telefone, matricula);
    this.departamento = departamento;
    this.titulacao = titulacao;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public String getTitulacao() {
    return titulacao;
  }

  public void setTitulacao(String titulacao) {
    this.titulacao = titulacao;
  }

  @Override
  public String toString() {
    return "Professor{" +
        "departamento='" + departamento + '\'' +
        ", titulacao='" + titulacao + '\'' +
        "} " + super.toString();
  }
}