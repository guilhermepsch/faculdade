import java.util.ArrayList;

public class Turma
{
    private String nomeDisciplina;
    private String nomeProfessor;
    private ArrayList<Aluno> alunos;
    
    public Turma (String nomeDisciplina, String nomeProfessor)
    {
        this.nomeDisciplina = nomeDisciplina;
        this.nomeProfessor = nomeProfessor;
        this.alunos = new ArrayList<Aluno>();
    }
    
    public void addAluno(Aluno aluno)
    {
        alunos.add(aluno);    
    }
    
    public int getQuantidadeAlunos()
    {
        return this.alunos.size();
    }
    
    public void imprimeAlunos()
    {
        System.out.println("Professor — "+ this.nomeProfessor);
        System.out.println("Disciplina — "+ this.nomeDisciplina);
        System.out.println("——— Alunos ———");
        for (int i = 0; i < this.alunos.size(); i++){
            System.out.printf("%s — %d", this.alunos.get(i).getNome(), this.alunos.get(i).getMatricula());
        }
    }
}