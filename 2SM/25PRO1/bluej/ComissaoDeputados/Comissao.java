import java.util.ArrayList;

public class Comissao
{
    
    private String titulo;
    private ArrayList<Deputado> deputados;
    
    public Comissao(String titulo)
    {
        this.titulo = titulo;
        deputados = new ArrayList();
    }
    
    public void addDeputado(Deputado deputado)
    {
        this.deputados.add(deputado);
    }
    
    public boolean setTitulo(String titulo)
    {
        if (!this.titulo.equals(titulo) && !titulo.isBlank()){
            this.titulo = titulo;
            return true;
        }
        return false;
    }
    
    public void imprimirDeputados()
    {
        System.out.println("Comissão: "+this.titulo);
        for (Deputado dep : this.deputados){
            System.out.println(dep.toString());
        }
    }
    
    public void imprimirDeputados(int partido)
    {
        for (Deputado dep : this.deputados){
            if (partido == dep.getPartido()){
                System.out.println(dep.toString());
            }
        }
    }
    
    public void imprimirDeputados(String estado)
    {
        for (Deputado dep : this.deputados){
            if (estado.equals(dep.getEstado())){
                System.out.println(dep.toString());
            }
        }
    }
    
    public void imprimirQtdPorPartido()
    {
        ArrayList<Integer> quantidades = new ArrayList();
        ArrayList<Integer> partidos = new ArrayList();
        
        for (Deputado dep : this.deputados){
            
            if (!partidos.contains(dep.getPartido())){
                partidos.add(dep.getPartido());
                quantidades.add(0);
            }
        }
        
        int index = 0;
        for (Integer partido : partidos){
            for (Deputado dep : this.deputados){
                if (dep.getPartido() == partido){
                    quantidades.set(index, (quantidades.get(index)+1));
                }
            }
            index++;
        }
        
        for (int i = 0; i < quantidades.size(); i++){
            System.out.printf(
                "%s%d%s%d%n",
                "Partido: ", partidos.get(i), " — ", quantidades.get(i));
        }
    }
    
}