public class DesenharRosto
{
    public static void main(String[] args){
        
        Triangulo triangul1 = new Triangulo();
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        Circulo circulo3 = new Circulo();
        Quadrado quadrado1 = new Quadrado();
        
        triangul1.cor = "black";
        triangul1.altura = 50;
        triangul1.base = 50;
        triangul1.x = 148;
        triangul1.y = 130;
        
        circulo1.cor = "blue";
        circulo1.diametro = 250;
        circulo1.x = 25;
        circulo1.y = 30;
        
        circulo2.cor = "green";
        circulo2.diametro = 50;
        circulo2.x = 70;
        circulo2.y = 80;
        
        circulo3.cor = "yellow";
        circulo3.diametro = 50;
        circulo3.x = 178;
        circulo3.y = 80;
        
        quadrado1.cor = "red";
        quadrado1.lado = 50;
        quadrado1.x = 123;
        quadrado1.y = 210;
        
        circulo1.desenhar();
        quadrado1.desenhar();
        triangul1.desenhar();
        circulo2.desenhar();
        circulo3.desenhar();
    }
}