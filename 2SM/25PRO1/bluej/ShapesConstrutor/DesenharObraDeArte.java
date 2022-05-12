public class DesenharObraDeArte
{
    public static void main(String[] args)
    {
        getSol().desenhar();
        getGrama().desenhar();
        getParede().desenhar();
        getTelhado().desenhar();
        getJanela().desenhar();
    }
    
    public static Circulo getSol()
    {
        Circulo sol = new Circulo("yellow", 50);
        sol.setX(240);
        sol.setY(20);
        return sol;
    }
    
    public static Quadrado getParede()
    {
        Quadrado parede = new Quadrado("red", 120);
        parede.setX(90);
        parede.setY(100);
        return parede;
    }
    
    public static Quadrado getJanela()
    {
        Quadrado janela = new Quadrado("black", 40);
        janela.setX(110);
        janela.setY(120);
        return janela;
    }
    
    public static Triangulo getGrama()
    {
        Triangulo grama = new Triangulo("green", 300, 150);
        grama.setX(150);
        grama.setY(100);
        return grama;
    }

    public static Triangulo getTelhado()
    {
        Triangulo telhado = new Triangulo("blue", 150, 50);
        telhado.setX(148);
        telhado.setY(50);
        return telhado;
    }   
}