package br.udesc.ddm.kotlin.declaracaovariaveis

/**
 * Em Kotlin, você pode declarar variáveis usando val e var, que têm diferenças significativas:
 *
 * val:
 *
 *     val é usado para declarar variáveis imutáveis, ou seja, uma vez que uma variável é atribuída com val, seu valor
 *     não pode ser alterado. É equivalente a uma variável final em Java.
 *     Exemplo: val nome = "João"
 *
 * var:
 *
 *     var é usado para declarar variáveis mutáveis, ou seja, você pode atribuir um novo valor a uma variável declarada com var.
 *     É útil quando você precisa de uma variável cujo valor pode mudar ao longo do tempo.
 *     Exemplo:
 *          var idade = 30
 *          idade = 31 // OK, idade pode ser alterada
 *
 */

fun main(){
    val nome = "João"
    //nome = "Mattheus" //Não é possível alterar pois foi declarado como val
    var idade = 30
    idade = 31 // OK, idade pode ser alterada

    println(nome)
    println(idade)
}