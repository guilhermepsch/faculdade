package questao2;

import java.util.ArrayList;

public class Curso {
  
  private String codigo;
  private String nome;
  private ArrayList<Turma> turmas;

  public Curso(String codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
    this.turmas = new ArrayList<>();
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Turma> getTurmas() {
    return turmas;
  }

  public void listarTurmasDeUmAlunoByMatricula(String matricula) {
    for (Turma turma : turmas) {
      for (Aluno aluno : turma.getAlunos()) {
        if (aluno.getMatricula().equals(matricula)) {
          System.out.println(turma);
        }
      }
    }
  }

  @Override
  public String toString() {
    return "Curso{" + "codigo=" + codigo + ", nome=" + nome +'}';
  }
}
