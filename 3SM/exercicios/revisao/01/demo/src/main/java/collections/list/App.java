package collections.list;
import collections.Agenda;
import collections.Contato;

public class App {

  public static void main(String[] args) {
    Agenda agenda = new AgendaList();
    agenda.adicionarContato(new Contato("João", "9999-9999"));
    agenda.adicionarContato(new Contato("Maria", "8888-8888"));
    agenda.adicionarContato(new Contato("José", "7777-7777"));
    agenda.adicionarContato(new Contato("Pedro", "6666-6666"));
    agenda.adicionarContato("Paulo", "5555-5555");

    Contato contato = agenda.buscarContatoNome("Maria");

    System.out.println(contato);

  }
}