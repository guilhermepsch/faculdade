import java.util.ArrayList;

public class GrupoWhatsapp
{

    private String nome;
    private ArrayList<Participante> participantes;
    
    GrupoWhatsapp(String nome, Participante primeiroParticipante)
    {
        this.nome = nome;
        this.participantes = new ArrayList();
        this.participantes.add(primeiroParticipante);
    }
    
    public void addParticipante(Participante participante)
    {
        this.participantes.add(participante);
    }
    
    public void delParticipante(Participante participante)
    {
        this.participantes.remove(participante);
    }
    
    public void imprimeParticipantes()
    {
        System.out.printf("%s%n",this.nome);
        for (int i = 0; i < this.participantes.size(); i++){
            System.out.printf("%s%s%d%n", this.participantes.get(i).getNome(), " — ", this.participantes.get(i).getTelefone());
        }
        System.out.println("————————————");
    }
}