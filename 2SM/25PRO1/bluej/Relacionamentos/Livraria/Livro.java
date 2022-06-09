import java.util.*;

public class Livro
{
    private String titulo;
    private int ano;
    private int paginas;
    private Editora editora;
    private List<Autor> autores;
    
    public Livro(String titulo, int ano, int paginas)
    {
        this.titulo = titulo;
        this.ano = ano;
        this.paginas = paginas;
        autores = new ArrayList();
    }
    
    public void addAutor(Autor autor)
    {
        autores.add(autor);
    }
    
    public boolean setEditora(Editora editora)
    {
        if (editora !=  null){
            this.editora = editora;
            return true;
        }
        return false;
    }
    
    public String toString()
    {
        String retorno = String.format("Título: %s, Ano: %d, Qtd. Páginas: %d%n", this.titulo,this.ano,this.paginas);
        retorno += String.format("Autor(es): %n");
        for (Autor autor : this.autores){
            if (autor.getPseudonimo() == null){
                retorno += String.format("      %s%n", autor.getNome());
            } else {
                retorno += String.format("      %s (Pseudônimo: %s)%n",autor.getNome(),autor.getPseudonimo());
            }
        }
        retorno += String.format("Editora: %n%s (%s)", this.editora.getNome(), this.editora.getCidade());
        return retorno;
    }
}