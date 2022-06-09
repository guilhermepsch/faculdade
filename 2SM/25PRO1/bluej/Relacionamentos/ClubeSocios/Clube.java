import java.util.*;

public class Clube
{
    private String nome;
    private String cidade;
    private List<Socio> socios;
    
    public Clube(String nome, String cidade)
    {
        this.nome = nome;
        this.cidade = cidade;
        socios = new ArrayList<Socio>();
    }
    
    public void imprimirSocios()
    {
        for (Socio socio : this.socios){
            System.out.println(socio.toString());
        }
    }
    
    public void imprimirSociosMenoresDeIdade()
    {
        for (Socio socio : this.socios){
            if (socio.getIdade() < 18){
            System.out.println(socio.toString());
            }
        }
    }
    
    public double getIdadeMediaSocios()
    {
        int cont = 0;
        double idadeCont = 0;
        for (Socio socio : this.socios){
            idadeCont += socio.getIdade();
            cont++;
        }
        return idadeCont/cont;
    }
    
    public void imprimirSociosMaiorQueIdadeMedia()
    {
        for (Socio socio : this.socios){
            if (socio.getIdade() > this.getIdadeMediaSocios()){
            System.out.println(socio.toString());
            }
        }
    }
    
    public double getArrecadacaoMensalidade()
    {
        double mensalidadeCount = 0;
        for (Socio socio : this.socios){
            mensalidadeCount += socio.getValorMensalidade();
        }
        return mensalidadeCount;
    }
    
    public boolean removeSocio(int matricula)
    {
        int posicao = -1;
        for (int i = 0; i < this.socios.size(); i++){
            if (this.socios.get(i).getMatricula() == matricula){
                posicao = i;
            }
        }
        
        if (posicao >= 0){
            this.socios.remove(posicao);
            return true;
        }
        return false;
    }
}