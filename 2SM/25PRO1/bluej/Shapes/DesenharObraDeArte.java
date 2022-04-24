public class DesenharObraDeArte
{
    public static void main(String[] args){
        
        Circulo sol = new Circulo();
        Quadrado parede = new Quadrado();
        Quadrado janela = new Quadrado();
        Triangulo grama = new Triangulo();
        Triangulo telhado = new Triangulo();

        sol.cor = "yellow";
	sol.diametro = 50;
	sol.x = 240;
	sol.y = 20;
	
	parede.cor = "red";
	parede.lado = 120;
	parede.x = 90;
	parede.y = 100;
        
	janela.cor = "black";
	janela.lado = 40;
	janela.x = 110;
	janela.y = 120;
	
	grama.base = 300;
        grama.cor = "green";
        grama.altura = 150;
        grama.x = 150;
        grama.y = 100;

	telhado.cor = "blue";
	telhado.altura = 50;
	telhado.base = 150;
	telhado.x = 148;
	telhado.y = 50;
        
        grama.desenhar();
        parede.desenhar();
        janela.desenhar();
        telhado.desenhar();
        sol.desenhar();
    }
}