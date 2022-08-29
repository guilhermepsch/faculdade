package revisao.banco;

public class ContaPoupanca extends Conta {
  
  public ContaPoupanca(int codigo, Banco banco, String nome, double saldo) {
    super(codigo, banco, nome, saldo);
  }

  @Override
  public void sacar(double valor) {
    if (this.saldo - valor < 0) {
      System.out.println("Saldo insuficiente");
      return;
    }
    this.saldo -= valor;
  };

}
