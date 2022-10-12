package exercicio.universidade;

public class Aluno extends Pessoa {
 
  private String matricula;

  public Aluno (String nome, String dataNascimento, String cpf)
  {
    super(nome, dataNascimento, cpf);
    this.matricula = String.format("A%s%d", dataNascimento.split("/")[2], Pessoa.getId());
    Pessoa.incrementId();
  }

  public String getMatricula()
  {
    return this.matricula;
  }

}
