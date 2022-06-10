public class MainLivraria {
    
    public static void main(String[] args)
    {
        Editora editora1 = new Editora("Foda-se", "Sexocity");
        Livro livro1 = new Livro("Biblia do Sexo", 420, 69);
        Autor autor1 = new Autor("Meussa");
        Autor autor2 = new Autor("Sexooooooooooo");
        
        autor2.setPseudonimo("Sexoman");
        livro1.setEditora(editora1);
        livro1.addAutor(autor1);
        livro1.addAutor(autor2);
        System.out.print(livro1.toString());
    }
    
}