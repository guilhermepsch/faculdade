package br.udesc.ddm.kotlin.heranca.polimorfismo

/**
 *     Herança:
 *         Herança é um conceito fundamental na programação orientada a objetos, onde uma classe pode herdar atributos
 *         e comportamentos de outra classe. Em Kotlin, a herança é declarada usando a palavra-chave :, seguida pelo
 *         nome da classe base da qual você deseja herdar.
 *         Por exemplo: class SubClasse : ClasseBase().
 *         A classe que herda é chamada de subclasse (ou classe derivada) e a classe da qual ela herda é chamada de
 *         superclasse (ou classe base). A subclasse herda todos os membros da superclasse, exceto aqueles que são
 *         marcados como private. Em Kotlin, todas as classes herdam implicitamente da classe Any, que é a superclasse
 *         raiz de todas as classes em Kotlin.
 *
 *       Para Classes:
 *         Se você deseja que uma classe possa ser herdada por outras classes, você deve marcá-la como open.
 *         Por padrão, as classes em Kotlin são final, o que significa que elas não podem ser estendidas. Portanto,
 *         se você planeja criar uma hierarquia de herança com uma classe como base, você precisa explicitamente marcá-la como open.
 *         ex: open class Animal { }
 *         As classes abstratos possibilitam a herança sem a palavra reservada open
 *
 *       Para Métodos:
 *         Se você deseja que um método possa ser sobrescrito por subclasses, você deve marcá-lo como open.
 *         Por padrão, os métodos em Kotlin são final, o que significa que eles não podem ser sobrescritos. Portanto, se você
 *         deseja permitir que subclasses substituam a implementação de um método, você precisa marcá-lo como open.
 *         ex: open fun fala().
 *         Os métodos abstratos possibilitam a sobrescrita sem a palavra reservada open
 *
 *     Sobrescrita de Métodos:
 *         Sobrescrita de métodos é o processo de substituir a implementação de um método em uma superclasse na subclasse.
 *         Para sobrescrever um método em Kotlin, você usa a palavra-chave override antes da declaração do método na subclasse.
 *         A assinatura do método na subclasse (nome do método e tipos de parâmetros) deve ser idêntica à da superclasse.
 *         Quando um método é chamado em uma instância da subclasse, a versão do método na subclasse é executada, mesmo
 *         que a referência seja da superclasse.
 *
 *     Super:
 *         A palavra-chave super em Kotlin é usada para acessar membros da superclasse dentro da subclasse.
 *         Você pode chamar o construtor da superclasse usando super() na primeira linha do construtor da subclasse.
 *         Você também pode chamar métodos e acessar propriedades da superclasse usando super.nomeDoMetodo() ou super.nomeDaPropriedade.
 *         Isso é útil quando você quer acessar a implementação da superclasse em vez de sobrescrevê-la completamente.
 *
 *
 */

//classe abstrata
abstract class Animal {
    abstract fun fala()
}

class Gato : Animal() {
    override fun fala() {
        println("Miau")
    }
}

open class Cachorro : Animal() {
    override fun fala() {
        println("Au au au")
    }

    open fun brinca(){
        println("brincando sem parar!!")
    }

}

class CachorroPolicial : Cachorro() {
    override fun brinca() {
        print("Após o expediente - ")
        super.brinca()
    }
}

fun main() {
    val cachorro: Animal = Cachorro()
    cachorro.fala()
    //cachorro.socializa() //nao funciona pq foi declarado como Animal

    val cachorro2 = cachorro as Cachorro //casting para utilizar método socializa()
    cachorro2.brinca()

    val gato: Animal = Gato()
    gato.fala()


    val cachorroPolicial = CachorroPolicial()
    cachorroPolicial.brinca()

    val animais = mutableListOf<Animal>()
    animais.add(cachorro)
    animais.add(gato)
    animais.add(cachorroPolicial)

    for (animal in animais) {
        if (animal is Cachorro) { //equivale ao instaceof e já converte o objeto em Cachorro dentro do bloco
            print("É um cachorro: ")
            animal.brinca()
        }
        animal.fala()
    }

}