// Guilherme Pereira Schneidt
import java.util.*;

public class Palestra
{
    private String titulo;
    private String local;
    private double valorIngresso;
    private String periodo;
    private List<Participante> participantes;
    
    public Palestra (String titulo, String local, double valorIngresso, String periodo)
    {
        this.titulo = titulo;
        this.local = local;
        this.valorIngresso = valorIngresso;
        this.periodo = periodo;
        this.participantes = new ArrayList<Participante>();
    }
    
    public boolean addParticipante(Participante participante)
    {
        if (participante != null){
            this.participantes.add(participante);
            return true;
        }
        return false;
    }
    
    public boolean setLocal(String local)
    {
        if (!local.isBlank()){
            this.local = local;
            return true;
        }
        return false;
    }
    
    
    public boolean setPeriodo(String periodo)
    {
        if (!periodo.isBlank()){
            this.periodo = periodo;
            return true;
        }
        return false;
    }
    
    public void imprimePalestra()
    {
        System.out.printf("%s%n", this.toString());
        System.out.printf("Participantes%n");
        for (Participante participante : this.participantes){
            System.out.printf("%s%n", participante.toString());
        }
    }
    
    public void imprimeParticipantes(int idade)
    {
        for (Participante participante : this.participantes){
            if (participante.getIdade() == idade){
                System.out.printf("%s%n", participante.toString());
            }
        }
    }
    
    public void imprimeParticipantes(String cidade)
    {
        for (Participante participante : this.participantes){
            if (participante.getCidade().equals(cidade)){
                System.out.printf("%s%n", participante.toString());
            }
        }
    }
    
    public boolean removeParticipante(String nome){
        int posicao = -1;
        for (int i = 0; i < this.participantes.size(); i++){
            if (this.participantes.get(i).getNome().equals(nome) && posicao == -1){
                posicao = i;
            }
        }
        
        if (posicao != -1){
            this.participantes.remove(posicao);
            return true;
        }
        return false;
    }
    
    public void imprimeQuantidadePorCidade()
    {
        ArrayList<String> cidades = new ArrayList<String>();
        ArrayList<Integer> quantidade = new ArrayList<Integer>();
        
        for (Participante participante : this.participantes){
            if (!cidades.contains(participante.getCidade())){
                cidades.add(participante.getCidade());
                quantidade.add(0);
            }
        }
        
        for (int index = 0; index < cidades.size(); index++){
            for (Participante participante : this.participantes){
                if (participante.getCidade() == cidades.get(index)){
                    quantidade.set(index, quantidade.get(index)+1);
                }
            }
        }
        
        for (int index = 0; index < cidades.size(); index++){
            System.out.printf("%s: %d participantes%n", cidades.get(index), quantidade.get(index));
        }
    }
    
    public String toString()
    {
        return String.format("Palestra: %s — %s — R$ %s — %s", this.titulo, this.local, String.format("%.2f", this.valorIngresso), this.periodo);
    }
}