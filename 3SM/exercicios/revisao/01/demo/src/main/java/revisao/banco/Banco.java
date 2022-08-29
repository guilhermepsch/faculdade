package revisao.banco;
import java.util.*;

public class Banco {
  private static int bancoCodigo = 0;
  private int contaContador = 0;
  private int codigo;
  private String nome;
  private List<Conta> contas;

  public Banco(String nome) {
    bancoCodigo++;
    this.codigo = bancoCodigo;
    this.nome = nome;
    this.contas = new ArrayList<Conta>();
  }

  public int getCodigo() {
    return codigo;
  }
  public String getNome() {
    return nome;
  }

  public void addConta(String nome, double saldo) {
    this.contaContador++;
    Conta conta = new Conta(contaContador, this, nome, saldo);
    contas.add(conta);
  }

  public void addContaPoupanca(String nome, double saldo) {
    this.contaContador++;
    ContaPoupanca conta = new ContaPoupanca(contaContador, this, nome, saldo);
    contas.add(conta);
  }

  public Conta getConta(int codigo) {
    for (Conta conta : contas) {
      if (conta.getCodigo() == codigo) {
        return conta;
      }
    }
    return null;
  }
}
