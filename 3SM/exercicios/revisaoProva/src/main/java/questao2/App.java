package questao2;

public class App {
  
  public static void main(String[] args) throws SalaCheiaException {
    Professor professor = new Professor("João", "690.384.790-18", "1234");
    Aluno aluno1 = new Aluno("Maria", "581.663.670-76", "4123");
    Aluno aluno2 = new Aluno("José", "415.752.800-00", "5467");
    Aluno aluno3 = new Aluno("Zacarias", "987.654.321-00", "8943");
    Aluno aluno4 = new Aluno("Amyl", "454.831.030-41", "2154");
    Aluno aluno5 = new Aluno("Henrique", "123.564.235-21", "4321");

    Curso curso = new Curso("123", "Ciência da Computação");
    Turma turma1 = new Turma("A", curso, professor, "Programação Orientada a Objetos", 3);
    Turma turma2 = new Turma("B", curso, professor, "Programação Orientada a Objetos", 3);

    turma1.addAluno(aluno1);
    turma1.addAluno(aluno2);
    turma1.addAluno(aluno3);

    turma2.addAluno(aluno4);
    turma2.addAluno(aluno5);

    curso.getTurmas().add(turma1);
    curso.getTurmas().add(turma2);

    System.out.println("Todos os alunos matriculados em uma turma");
    turma1.listarTodosOsAlunos();
    System.out.println("-----------------------------");

    System.out.println("Todas as turmas de um aluno no curso a partir da matricula.");
    curso.listarTurmasDeUmAlunoByMatricula("4123");
    System.out.println("-----------------------------");

    System.out.println("Todos os alunos da turma em ordem alfabética.");
    turma1.listarTodosAlunosAlfabetica();
    System.out.println("-----------------------------");

    System.out.println("Todos os alunos de uma turma em ordem crescente do CPF.");
    turma1.listarTodosAlunosPorCpfCrescente();
    System.out.println("-----------------------------");

  }
  

}
