package exercicio.universidade;

import java.util.ArrayList;
import java.util.List;

public class Turma {

  private static int codigoCounter;

  private int codigo;
  private Curso curso;
  private String nome;
  private int vagas;
  private List<Aluno> alunosMatriculados;

  public Turma(int codigo, Curso curso, String nome, int vagas) {
    this.codigo = codigoCounter;
    this.curso = curso;
    this.nome = nome;
    this.vagas = vagas;
    alunosMatriculados = new ArrayList<>();
    codigoCounter++;
    curso.addTurma(this);
  }

  public int getCodigo() {
    return this.codigo;
  }

  public Curso getCurso() {
    return this.curso;
  }

  public String getNome() {
    return this.nome;
  }

  public int getVagas() {
    return this.vagas;
  }

  public List<Aluno> getAlunosMatriculados() {
    return this.alunosMatriculados;
  }

  public boolean addAluno(Aluno aluno) {
    if (alunosMatriculados.size() == vagas) {
      return false;
    }
    if (alunosMatriculados.contains(aluno)) {
      return false;
    }
    alunosMatriculados.add(aluno);
    return true;
  }

  public boolean removeAluno(Aluno aluno) {
    for (Aluno a : alunosMatriculados) {
      if (a.getMatricula() == aluno.getMatricula()) {
        alunosMatriculados.remove(aluno);
        return true;
      }
    }
    return false;
  }

  public void ListarTodosAlunos(){
    for (Aluno a : alunosMatriculados){
      System.out.println(a.toString());
    }
  }

  public void ListarInformacoesTurma(){
    System.out.println(curso.toString());
    System.out.println(this.toString());
    for (Aluno a : alunosMatriculados){
      System.out.println(a.toString());
    }
  }

}
