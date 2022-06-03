
public class ContaBanco{
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco () {
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(int numConta, String t, String d) {
        this.numConta = numConta;
        this.tipo = t;
        this.dono = d;
        if (tipo.equals("CC")) {
            this.saldo += 50;
        } else if (tipo.equals("CP")) {
            this.saldo += 150;
        }
        this.status = true;
        System.out.println("Conta aberta com sucesso.");
    }
    
    public void fecharConta() {
                if (this.saldo > 0) {
            System.out.println("Conta não pode ser fechada. Saldo positivo.");
        } else if (this.saldo < 0) {
            System.out.println("Conta não pode ser fechada. Saldo negativo.");
        } else if (this.saldo == 0) {
            this.status = false; 
            System.out.println("Conta fechada com sucesso.");
        }
        
    }
    
    public void depositar(double d) {
        if (this.status = true) {
            this.saldo += d;
        }
    }
    
    public void sacar(double s) {
        if (this.status = true && s <= this.saldo) {
            this.saldo -= s;
        }
    }
    
    public void pagarMensal(){
        if (tipo.equals("CC")) {
            this.saldo -= 12;
        } else if (tipo.equals("CP")) {
            this.saldo -= 20;
        }
    }

    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double s) {
        this.saldo = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean s) {
        this.status = s;
    }
}
