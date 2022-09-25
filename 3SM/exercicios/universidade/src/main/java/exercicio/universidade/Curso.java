package exercicio.universidade;

import java.util.ArrayList;
import java.util.List;

public class Curso {

  private String codigo;
  private String nome;
  private String dataCriacao;
  private String descricao;
  private List<Turma> turmas;

  public Curso(String codigo, String nome, String dataCriacao, String descricao) {
    this.codigo = codigo;
    this.nome = nome;
    this.dataCriacao = dataCriacao;
    this.descricao = descricao;
    turmas = new ArrayList<>();
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getNome() {
    return this.nome;
  }

  public String getDataCriacao() {
    return this.dataCriacao;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void imprimeTurmasPorMatriculaAluno(String matricula) {
    for (Turma t : turmas) {
      for (Aluno a : t.getAlunosMatriculados()) {
        if (a.getMatricula().equals(matricula)) {
          System.out.println(t.toString());
        }
      }
    }
  }

  public void imprimeTodasTurmasTodosAlunos(){
    System.out.println(this.toString());
    for (Turma t : turmas) {
      System.out.println(t.toString());
      for (Aluno a : t.getAlunosMatriculados()) {
        System.out.println(a.toString());
      }
    }
  }

  public void addTurma(Turma turma) {
    this.turmas.add(turma);
  }
}
