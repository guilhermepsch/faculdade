package br.udesc.ddm.kotlin.`interface`

interface Autenticavel {
    fun autentica(senha: String): Boolean
}

abstract class Pessoa(var nome: String, var cPF: String)

open class Funcionario(nome: String, cPF: String, var matricula: String) : Pessoa(nome, cPF)

class Diretor(nome: String, cPF: String, matricula: String) : Funcionario(nome, cPF, matricula)

class Engenheiro(nome: String, cPF: String, matricula: String) : Funcionario(nome, cPF, matricula)


class Cliente(nome: String, cPF: String) : Pessoa(nome, cPF), Autenticavel {
    override fun autentica(senha: String): Boolean {
        return senha == cPF
    }
}

class Gerente(nome: String, cPF: String, matricula: String) : Funcionario(nome, cPF, matricula), Autenticavel {
    private val senha: String

    /**
     * Em Kotlin, o bloco init é usado para inicializar o estado de uma classe. Ele é executado imediatamente após a
     * instância de uma classe ser criada e antes que qualquer outro código dentro da classe seja executado.
     *
     * O bloco init é útil quando você precisa executar alguma lógica de inicialização complexa que não pode ser
     * feita diretamente na declaração das propriedades da classe. Por exemplo, você pode usar o bloco init para
     * configurar valores iniciais para as propriedades da classe com base em parâmetros de construtor ou realizar
     * operações de inicialização que exigem mais do que uma única instrução.
     *
     * Você pode ter vários blocos init em uma classe, e eles serão executados na ordem em que foram declarados.
     * O bloco init é uma maneira útil de organizar a lógica de inicialização em suas classes e garantir que ela
     * seja executada sempre que uma instância da classe for criada.
     *
     */
    init {
        senha = matricula + cPF
        println("Primeiro init")
    }

    init {
        println("Segundo init")
    }

    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}

fun main(){
    val pessoas: MutableList<Pessoa> = ArrayList()

    pessoas.add(Cliente("Cliente", "123"))
    pessoas.add(Funcionario("Funcionario", "123", "456"))
    pessoas.add(Engenheiro("Engenheiro", "789", "012"))
    pessoas.add(Gerente("Gerente", "345", "678"))
    pessoas.add(Diretor("Diretor", "901", "234"))

    for (p in pessoas) {
        println(p.nome)
    }

    val a1: Autenticavel = Cliente("Cliente2", "123")
    val a2: Autenticavel = Gerente("Gerente2", "345", "678")

    println(a1.autentica("123"))
    println(a2.autentica("345"))

    val autenticaveis: MutableList<Autenticavel> = ArrayList()
    autenticaveis.add(a1)
    autenticaveis.add(a2)

}