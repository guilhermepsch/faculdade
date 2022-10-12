package exercicio.universidade;

public class Professor extends Pessoa {

  private Curso curso;
  private String matricula;
  private String dataAdmissao;

  public Professor(String nome, String dataNascimento, String cpf, Curso curso, String dataAdmissao) {
    super(nome, dataNascimento, cpf);
    this.curso = curso;
    this.dataAdmissao = dataAdmissao;
    this.matricula = String.format("P%s%d", dataNascimento.split("/")[2], Pessoa.getId());
    Pessoa.incrementId();
  }

  public Curso getCurso()
  {
    return this.curso;
  }

  public String getMatricula()
  {
    return this.matricula;
  }

  public boolean setCurso(Curso curso)
  {
    if (curso == null){
      return false;
    }
    this.curso = curso;
    return true;
  }

  public String getDataAdmissao()
  {
    return this.dataAdmissao;
  }

}
