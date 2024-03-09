package br.udesc.ddm.kotlin.declaracaovariaveis

/**
 * Em Kotlin, o ponto de interrogação ? é usado para indicar que um tipo pode ser nulo. Isso é parte do sistema de
 * tipos nullable, que permite que variáveis tenham valores nulos. Quando você declara um atributo com um tipo seguido
 * por ?, você está permitindo que esse atributo aceite valores nulos.
 *Por exemplo: var nome: String? = null
 *
 * Neste caso, nome é uma variável do tipo String?, o que significa que ela pode armazenar uma referência a um objeto
 * do tipo String, ou pode ser null.
 *
 * Você usa o operador de chamada segura (?.) quando deseja chamar métodos ou acessar propriedades em variáveis que
 * podem ser nulas.
 * Por exemplo: val length = nome?.length
 *
 * Aqui, nome?.length retornará o comprimento da string se nome não for nulo e null se nome for nulo. Isso evita uma
 * exceção de NullPointerException.
 *
 * No entanto, se você tem certeza de que a variável nunca será nula em um determinado ponto do código, você pode usar
 * o operador de asserção de não nulo (!!). Isso diz ao compilador que você está certo de que a variável não é nula e
 * que você quer acessar seu valor diretamente. Mas tenha cuidado ao usar o operador !!, pois se a variável for nula,
 * uma exceção de NullPointerException será lançada.
 *
 * Em resumo, o ponto de interrogação ? em Kotlin indica que um tipo pode ser nulo, e você deve lidar com valores nulos
 * usando operadores de chamada segura (?.) ou operadores de asserção de não nulo (!!).
 */

fun main() {
    //val nome2: String = null //Não vai funcionar pois por padrão não é possível atribuir null

    val nome: String? = null
    var length = nome?.length //evita lançar NullPointerException

    println(nome)
    println(length)

    length = nome!!.length //Vai lançar exceção NullPointerException
}
