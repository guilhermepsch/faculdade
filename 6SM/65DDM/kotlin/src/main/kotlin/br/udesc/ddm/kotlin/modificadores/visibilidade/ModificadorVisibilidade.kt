package br.udesc.ddm.kotlin.modificadores.visibilidade

/**
 *     public:
 *         É o modificador de visibilidade padrão em Kotlin.
 *         Os membros marcados como public são visíveis em qualquer lugar onde o código que contém esses membros
 *         seja acessível. Isso significa que esses membros são acessíveis em qualquer lugar, dentro ou fora do pacote,
 *         classe ou módulo em que foram declarados.
 *
 *     internal:
 *         Os membros marcados como internal são visíveis apenas dentro do mesmo módulo em que foram declarados.
 *         Um módulo em Kotlin geralmente consiste em um conjunto de arquivos compilados juntos, geralmente um diretório.
 *         Isso permite que o código seja compartilhado dentro do mesmo módulo, mas não é acessível fora dele.
 *
 *     protected:
 *         Os membros marcados como protected são visíveis apenas na classe em que são declarados e nas suas subclasses.
 *         Isso permite que os membros sejam acessados apenas no escopo da hierarquia de herança da classe.
 *
 *     private:
 *         Os membros marcados como private são visíveis apenas na classe em que são declarados.
 *         Isso garante que os membros sejam acessíveis apenas dentro do escopo da classe em que foram declarados e não
 *         possam ser acessados de fora dela.
 *
 * É importante observar que os modificadores de visibilidade em Kotlin fornecem um controle mais refinado sobre o
 * acesso aos membros do que em Java, especialmente o modificador internal, que não tem um equivalente direto em Java.
 * Isso permite uma melhor encapsulação e controle sobre o acesso ao código em diferentes partes de um projeto.
 */
open class Funcionario(private val codigo: Int, val nome: String, protected val cpf: String, internal val cargo: String) {

    fun getCodigo(): Int {
        return codigo
    }

    fun getCPF(): String {
        return cpf
    }

    fun getCargo(): String {
        return cargo
    }
}


/**
 *     A função main() é declarada diretamente, sem a necessidade de uma classe wrapper.
 *     A criação de instância de Funcionario é feita da mesma forma que em Java.
 *     Para imprimir os valores, é utilizada a sintaxe de string template (${...}) para interpolação de variáveis dentro da string.
 */
fun main() {
    val funcionario = Funcionario(1, "Marina", "12345", "DevOps")

    println("Codigo: ${funcionario.getCodigo()}")
    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.getCPF()}")
    println("Cargo: ${funcionario.cargo}")
}

