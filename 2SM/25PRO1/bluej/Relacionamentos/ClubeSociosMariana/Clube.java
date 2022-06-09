import java.util.ArrayList;
public class Clube
{
    private String nome;
    private String cidade;
    private ArrayList<Socio> socio;
    
    public Clube(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
        this.socio = new ArrayList<Socio>();
    }
    
    public void addSocio(Socio soc){
        this.socio.add(soc);
    }
    
    public void imprimirSocios(){
        System.out.println("Sócio(s): \n");
        for(Socio soc : this.socio){
            System.out.println(soc.toString() + "\n");
        }
    }
    
    public void imprimirSociosMenoresDeIdade(){
        System.out.println("Sócio(s) Menor(es) de Idade: \n");
        for(Socio soc : this.socio){
            if(soc.getIdade() < 18){
                System.out.println(soc.toString() + "\n");
            }else{
                System.out.println("Não há sócios menores de idade");
            }
        } 
    }
    
    public double getIdadeMediaSocios(){
        int somaIdades = 0;
        int quantSocios = 0;
        
        for(Socio soc : this.socio){
            somaIdades += soc.getIdade();
            quantSocios += 1;
        }
        
        return somaIdades / quantSocios;
    }
    
    public void imprimirSociosIdadeMaiorQueMedia(){
        System.out.println("Sócio(s) mais velho(s) que a média de idade: \n");
        for(Socio soc : this.socio){
            if(soc.getIdade() > getIdadeMediaSocios()){
                System.out.println(soc.toString() + "\n");
            }
        }
    }
    
    public double getArrecadacaoMensalidades(){
        double somaMensal = 0;
        for(Socio soc : this.socio){
            somaMensal += soc.getValorMensalidade();
        }
        return somaMensal;
    }
    
    public boolean removerSocio(int matricula){
        int posicao = -1;
        for(int i = 0; i < this.socio.size(); i++){
        Socio soc = this.socio.get(i);
        if(soc.getMatricula() == matricula){
            posicao = i;
        }
        }
        
        if (posicao >= 0){
            this.socio.remove(posicao);
            return true;
        }else{
            return false;
        }
    }
}
