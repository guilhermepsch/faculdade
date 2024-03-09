package br.udesc.ddm.kotlin.modificadores.outropacote

import br.udesc.ddm.kotlin.modificadores.visibilidade.Funcionario

class FuncionarioEspecial(codigo: Int, nome: String, cpf: String, cargo: String) : Funcionario(codigo, nome, cpf, cargo) {

    override fun toString(): String {
        return "$nome, $cpf, ${getCargo()}"
    }
}

fun main() {
    val funcionario = Funcionario(1, "Marina", "12345", "DevOps")

    println("Codigo: ${funcionario.getCodigo()}")
    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.getCPF()}")
    println("Cargo: ${funcionario.cargo}")

    val funcionarioEspecial = FuncionarioEspecial(1, "Lara", "12345", "DevOps")
    println("\nFuncionário Especial: $funcionarioEspecial")
}
