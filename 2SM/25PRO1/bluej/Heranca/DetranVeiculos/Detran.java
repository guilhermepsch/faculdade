import java.util.*;

public class Detran
{
    private String estado;
    private List<Veiculo> veiculos;
    
    public Detran (String estado)
    {
        this.estado = estado;
        veiculos = new ArrayList<Veiculo>();
    }
    
    public void addVeiculo(Veiculo veiculo)
    {
        this.veiculos.add(veiculo);
    }
    
    public String getEstado()
    {
        return this.estado;
    }
    
    public boolean setEstado(String estado)
    {
       if (!estado.isBlank()){
           this.estado = estado;
           return true;
       }
       return false;
    }
    
    public String toString()
    {
        String retorno = String.format("Estado: %s%n", this.getEstado());
        for (Veiculo vei : this.veiculos){
            retorno += String.format("%s%n", vei.toString());
        }
        return retorno;
    }
}