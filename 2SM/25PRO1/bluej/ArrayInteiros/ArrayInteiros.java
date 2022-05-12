import java.util.Scanner;

public class ArrayInteiros
{
    
    private int[] array;
    
    public ArrayInteiros(int tamanho)
    {
        this.array = new int[tamanho];
    }
    
    public void preencher()
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < this.array.length; i++){
            System.out.printf("Digite o valor %d", i);
            int valor = scan.nextInt();
            this.array[i] = valor;
        }
    }
    
    public void imprimir()
    {
        for (int i = 0; i < this.array.length; i++){
            System.out.printf("%d", this.array[i]);
            if (i < this.array.length-1){
                System.out.printf(", ");
            }
        }
        System.out.printf("\n");
    }
    
    public boolean existe(int valor)
    {
        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] == valor){
                return true;
            }
        }
        return false;
    }
    
    public void imprimeMaiores()
    {
        int posicao = 0;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < this.array.length; i++){
            if (this.array[i] > maior){
                maior = this.array[i];
                posicao = i;
            }
        }
        System.out.printf("Posição: %d", posicao);
        System.out.printf("Maior: %d", this.array[posicao]);
    }
    
    public void Fi()
    {
        for (int i = 0; i <= 100; i++){
            int frequencia = 0;
            for (int j = 0; j <= array.length-1; i++){
                if (array[j] == i){
                    frequencia++;
                }
            }
            System.out.printf("Frequencia: %d; Numero: %d", frequencia, i);
        }
    }
}