package br.udesc.pro2.exercicio.projeto.bb;


import org.junit.*;

public class BancoTeste {

    // Caso de teste
    // Entrada
    // Acao
    // Saida
    @Test
    public void novoTeste(){
        //arrange
        int a = 4;
        int b = 2;

        // act
        int res = a + b;

        org.junit.Assert.assertEquals(6, a+b);

    }

}