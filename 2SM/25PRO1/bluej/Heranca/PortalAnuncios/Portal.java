import java.util.*;

public class Portal
{
    private String nome;
    private String url;
    private List<Anuncio> anuncios;
    
    public Portal (String nome, String url)
    {
        this.nome = nome;
        this.url = url;
        anuncios = new ArrayList<Anuncio>();
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getUrl()
    {
        return this.url;
    }
    
    public boolean setNome(String nome)
    {
        if (nome.isBlank()){
            return false;
        }
        this.nome = nome;
        return true;
    }
    
    public boolean setUrl(String url)
    {
        if (url.isBlank()){
            return false;
        }
        this.url = url;
        return true;
    }
   
    public void addAnuncio(Anuncio anuncio){
        this.anuncios.add(anuncio);
    }
    
    public String toString()
    {
        String retorno = String.format("Portal: %s, URL: %s%n", this.getNome(), this.getUrl());
        for (Anuncio anuncio : this.anuncios){
            retorno += String.format("%s%n", anuncio.toString());
        }
        return retorno;
    }
}