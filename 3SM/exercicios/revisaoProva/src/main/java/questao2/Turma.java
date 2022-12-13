package questao2;

import java.util.ArrayList;

public class Turma {

  private String nome;
  private Curso curso;
  private Professor professor;
  private String nomeDaDisciplina;
  private int numeroDeVagas;
  private ArrayList<Aluno> alunos;

  public Turma(String nome, Curso curso, Professor professor, String nomeDaDisciplina, int numeroDeVagas) {
    this.nome = nome;
    this.curso = curso;
    this.professor = professor;
    this.nomeDaDisciplina = nomeDaDisciplina;
    this.numeroDeVagas = numeroDeVagas;
    this.alunos = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Curso getCurso() {
    return curso;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }

  public Professor getProfessor() {
    return professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public String getNomeDaDisciplina() {
    return nomeDaDisciplina;
  }

  public void setNomeDaDisciplina(String nomeDaDisciplina) {
    this.nomeDaDisciplina = nomeDaDisciplina;
  }

  public int getNumeroDeVagas() {
    return numeroDeVagas;
  }

  public void setNumeroDeVagas(int numeroDeVagas) {
    this.numeroDeVagas = numeroDeVagas;
  }

  public ArrayList<Aluno> getAlunos() {
    return alunos;
  }

  public void setAlunos(ArrayList<Aluno> alunos) {
    this.alunos = alunos;
  }

  public void addAluno(Aluno aluno){
    try{
      if (this.alunos.size() == this.numeroDeVagas) {
        throw new SalaCheiaException();
      }
      this.alunos.add(aluno);
    } catch (SalaCheiaException e) {
      System.out.println(e.getMessage());
    }
  }

  public void listarTodosOsAlunos() {
    for (Aluno aluno : alunos) {
      System.out.println(aluno);
    }
  }

  public void listarTodosAlunosAlfabetica() {
    ArrayList<Aluno> alunosOrdenados = new ArrayList<>();
    for (Aluno aluno : alunos) {
      alunosOrdenados.add(aluno);
    }
    alunosOrdenados.sort((Aluno a1, Aluno a2) -> a1.getNome().compareTo(a2.getNome()));

    for (Aluno aluno : alunosOrdenados) {
      System.out.println(aluno);
    }
  }

  public void listarTodosAlunosPorCpfCrescente() {
    ArrayList<Aluno> alunosOrdenados = new ArrayList<>();
    for (Aluno aluno : alunos) {
      alunosOrdenados.add(aluno);
    }
    alunosOrdenados.sort((Aluno a1, Aluno a2) -> a1.getCpf().compareTo(a2.getCpf()));

    for (Aluno aluno : alunosOrdenados) {
      System.out.println(aluno);
    }
  }

  @Override
  public String toString() {
    return "Turma{" + "nome=" + nome + ", curso=" + curso + ", professor=" + professor + ", nomeDaDisciplina="
        + nomeDaDisciplina + ", numeroDeVagas=" + numeroDeVagas + '}';
  }

}
