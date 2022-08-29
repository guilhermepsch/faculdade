package revisao.banco;

public class Conta {
  protected int codigo;
  protected String nome;
  protected Banco banco;
  protected double saldo;

  public Conta (int codigo, Banco banco, String nome, double saldo) {
    this.codigo = codigo;
    this.nome = nome;
    this.banco = banco;
    this.saldo = saldo;
  }
  
  public String getNome() {
    return nome;
  }

  public int getCodigo(){
    return codigo;
  }
  
  public double getSaldo() {
    return saldo;
  }
  
  public Banco getBanco() {
    return banco;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

}
