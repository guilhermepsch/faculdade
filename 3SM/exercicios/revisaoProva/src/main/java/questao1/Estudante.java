package questao1;

public class Estudante extends Pessoa {
  private String curso;
  private int anoIngresso;

  public Estudante(String nome, String cpf, String endereco, String telefone, int matricula, String curso, int anoIngresso) {
    super(nome, cpf, endereco, telefone, matricula);
    this.curso = curso;
    this.anoIngresso = anoIngresso;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public int getAnoIngresso() {
    return anoIngresso;
  }

  public void setAnoIngresso(int anoIngresso) {
    this.anoIngresso = anoIngresso;
  }

  @Override
  public String toString() {
    return "Estudante{" +
        "curso='" + curso + '\'' +
        ", anoIngresso=" + anoIngresso +
        "} " + super.toString();
  }
}
