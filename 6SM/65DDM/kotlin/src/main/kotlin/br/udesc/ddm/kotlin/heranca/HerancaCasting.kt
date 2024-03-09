package br.udesc.ddm.kotlin.heranca

import java.util.function.Consumer


fun main() {
    val mattheus = Funcionario("Mattheus", "4567", "Engenheiro de Software")

    if (mattheus is Pessoa) {
        println(mattheus.getNome() + " é uma pessoa")
    }
    if (mattheus is Funcionario) {
        println(mattheus.getNome() + " é um Funcionario")
    }
    val marilia = Pessoa("Marília", "123456")


    //Usando com listas
    val pessoas: MutableList<Pessoa> = ArrayList() //ou val pessoas = ArrayList<Pessoa>()
    pessoas.add(marilia)
    pessoas.add(mattheus)

    //praticando o foreach com functional programming (FP)
    pessoas.forEach(Consumer<Pessoa> { pessoa: Pessoa ->
        println(pessoa.getNome() + " é uma pessoa")
        if (pessoa is Funcionario) println(pessoa.getNome() + " é um Funcionario")
    })

    //ou apenas
    pessoas.forEach { pessoa ->
        println(pessoa.getNome() + " é uma pessoa")
        if (pessoa is Funcionario) println(pessoa.getNome() + " é um Funcionario")
    }
}