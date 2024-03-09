package br.udesc.ddm.kotlin.modificadores.escopo

/**
 *     geradorCodigo é convertido para uma propriedade estática dentro de um objeto companion (companion object).
 *     Isso permite que ela seja acessada como Funcionario.geradorCodigo.
 *     O construtor primário de Funcionario é simplificado, com nome sendo passado diretamente.
 *     A função estática copiarFuncionario é mantida, mas agora é definida dentro de um objeto companion, para
 *     acessá-la como Funcionario.copiarFuncionario().
 *     A função copiarFuncionario que opera no próprio objeto é mantida sem alterações.
 *     Os getters para codigo e nome são convertidos para funções simples, de acordo com a convenção de propriedades
 *     em Kotlin.
 */
class Funcionario(private val nome: String) {

    private val codigo = ++geradorCodigo

    fun getCodigo(): Int {
        return codigo
    }

    fun getNome(): String {
        return nome
    }

    companion object {
        var geradorCodigo = 0
        fun copiarFuncionario(f: Funcionario): Funcionario {
            return Funcionario(f.getNome())
        }
    }

    fun copiarFuncionario(): Funcionario {
        return Funcionario(this.getNome())
    }
}

fun main() {
    val funcionario1 = Funcionario("Malu")

    //chamada de método estático
    val copia = Funcionario.copiarFuncionario(funcionario1)

    println("Código: ${funcionario1.getCodigo()}")
    println("Nome: ${funcionario1.getNome()}")

    val funcionario2 = Funcionario("Lara")

    println("Código: ${funcionario2.getCodigo()}")
    println("Nome: ${funcionario2.getNome()}")

    val funcionario3 = Funcionario("Marina")

    println("Código: ${funcionario3.getCodigo()}")
    println("Nome: ${funcionario3.getNome()}")


    //funcionario3.geradorCodigo = 200 // Não é possível fazer desta forma (No Java é possível)
    Funcionario.geradorCodigo = 200

    val funcionario4 = Funcionario("Marília")

    println("Código: ${funcionario4.getCodigo()}")
    println("Nome: ${funcionario4.getNome()}")

    /*Cria outro funcionario com o nome do funcionario4, mas com o código diferente
        Utilizamos um método que está no escopo da classe
    */
    val funcionario5 = Funcionario.copiarFuncionario(funcionario4)

    println("Código: ${funcionario5.getCodigo()}")
    println("Nome: ${funcionario5.getNome()}")
}
