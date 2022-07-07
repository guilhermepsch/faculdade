import java.util.ArrayList;

/**
 * Representa um catálogo de uma coleção de filmes e albums musicais.
 * @author Fernando Santos
 */
public class Catalogo{
    private String colecionador;
    private ArrayList<Album> albuns;
    private ArrayList<Filme> filmes;

    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.albuns = new ArrayList<Album>();
        this.filmes = new ArrayList<Filme>();
    }

    public void addAlbum(Album umAlbum){
        this.albuns.add(umAlbum);
    }

    public void addFilme(Filme umFilme){
        this.filmes.add(umFilme);
    }

    public String toString(){
        String texto = "Colecionador: "+this.colecionador+"\n";
        texto += "Albuns: \n";
        for(Album alb: albuns){
            texto += "Titulo: "+alb.getTitulo()+", "+
            "Artista: "+alb.getArtista()+", "+
            "Faixas: "+alb.getFaixas()+", "+
            "Duracao: "+alb.getDuracao()+", "+
            "Comentario: "+alb.getComentario()+"\n";
        }

        texto += "Filmes:\n";
        for(Filme fil : filmes){
            texto += "Titulo: "+fil.getTitulo()+", "+
            "Diretor: "+fil.getDiretor()+", "+
            "Duracao: "+fil.getDuracao()+", "+
            "Comentario: "+fil.getComentario()+"\n";
        }
        return texto;
    }
}
