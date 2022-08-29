package revisao.banco;

public class App {

    public static void main(String[] args) throws Exception {
        Banco banco1 = new Banco("Banco do Brasil");
        banco1.addConta("Pedro", 1000.0);
        banco1.addConta("Maria", 2000.0);
        banco1.addContaPoupanca("João", 3000.0);
        banco1.addContaPoupanca("José", 4000.0);
        System.out.println(banco1.getConta(1).getSaldo());
        Banco banco2 = new Banco("Banco do Brasil");
        banco2.addConta("Felipe", 1000.0);
        banco2.addConta("Jackson 5", 2000.0);
        banco2.addContaPoupanca("Beise", 3000.0);
        banco2.addContaPoupanca("Balls", 4000.0);
        System.out.println(banco2.getConta(1).getSaldo());
    }

}
