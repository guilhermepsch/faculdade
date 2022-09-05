package collections;

public interface Agenda {
  public void adicionarContato(Contato contato);
  public void adicionarContato(String nome, String telefone);
  public Contato buscarContatoNome(String nome);
  public Contato buscarContatoTelefone(String telefone);
}
