package br.udesc.ddm.kotlin.heranca

open class Pessoa(private var nome: String, private var CPF: String) {
    fun getNome(): String {
        return nome
    }

    open fun imprimeDados() {
        println(nome)
        println(CPF)
    }
}

class Funcionario(nome: String, CPF: String, private var cargo: String) : Pessoa(nome, CPF) {

    override fun imprimeDados() {
        super.imprimeDados()
        println(cargo)
    }
}

fun main() {
    val pessoa = Pessoa("Marília", "123456")
    pessoa.imprimeDados()

    println()

    val funcionario = Funcionario("Mattheus", "4567", "Engenheiro de Software")
    funcionario.imprimeDados()
}
