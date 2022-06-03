public class InteiroPositivo
{
    
    private int inteiro;
    
    public int getInteiro()
    {
        return this.inteiro;
    }
    
    public boolean setInteiro(int inteiro)
    {
        if (inteiro > 0){
            this.inteiro = inteiro;
            return true;
        }
        return false;
    }
    
    public boolean verificaImpar()
    {
        if (this.getInteiro()%2 == 0){
            return false;
        }
        return true;
    }
    
    public void verificaDivisores()
    {
        int contador = 0;
        for (int i = this.getInteiro(); i >0; i--){
            if (this.getInteiro() / i == 0){
                contador++;
                System.out.printf("Divisor de x %d", i);
            }
        }
        System.out.printf("Quantidade de divisores: %d", contador);
    }
    
    public int realizaFatorial()
    {
        return this.fat(this.getInteiro());
    }
    
    public double calculaH()
    {
        double resultado = 0;
        for (int i = this.getInteiro(); i > 0; i--){
            resultado = resultado + 1 / (double) i;
        }
        return resultado;
    }
    
    public double calculaP()
    {
        double resultado = 0;
        for (int i = this.getInteiro(); i > 0; i --){
            if (i % 2 == 0){
                resultado = resultado -  i / this.fat(i*2);
            } else {
                resultado = resultado + i / this.fat(i*2);
            }
        }
        return resultado;
    }
    
    private int fat(int valor)
    {
        int resultado = valor;
        for (int i = (valor-1); i > 0; i--){
            resultado = resultado*i;
        }
        return resultado;
    }
    
    public double raiz()
    {
        return Math.sqrt(this.getInteiro());
    }
}