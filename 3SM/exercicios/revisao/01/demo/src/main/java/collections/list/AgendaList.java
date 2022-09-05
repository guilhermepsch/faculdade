package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import collections.Agenda;
import collections.Contato;

public class AgendaList implements Agenda {

  private List<Contato> contatos;

  public AgendaList() {
    this.contatos = new ArrayList<Contato>();
  }

  @Override
  public void adicionarContato(Contato contato) {
    this.contatos.add(contato);
  }

  @Override
  public Contato buscarContatoNome(String nome) {
    for (Contato contato : this.contatos) {
      if (contato.getNome().equals(nome)) {
        return contato;
      }
    }
    return null;
  }

  public void printWithConsumer() {
    this.contatos.forEach(new Consumer<Contato>() {
      @Override
      public void accept(Contato t) {
        System.out.println(t.getNome());
      }
    });
  }

  public void printWithLambda() {
    this.contatos.forEach((Contato t) -> System.out.println(t.getNome()));
  }

  @Override
  public Contato buscarContatoTelefone(String telefone) {
    for (Contato contato : this.contatos) {
      if (contato.getTelefone().equals(telefone)) {
        return contato;
      }
    }
    return null;
  }

  @Override
  public void adicionarContato(String nome, String telefone) {
    this.adicionarContato(new Contato(nome, telefone));
  }

}
