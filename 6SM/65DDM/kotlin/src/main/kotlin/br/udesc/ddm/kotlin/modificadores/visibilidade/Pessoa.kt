package br.udesc.ddm.kotlin.modificadores.visibilidade


class Pessoa(private var _nome: String, private val idade: Int) {

    var nome: String
        get() = _nome
        set(value) {
            _nome = value
        }

    fun mostrarInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade")
    }
}

fun main(){
    var p = Pessoa("mattheus", 37)
    p.mostrarInformacoes()
    p.nome = "dahora"
}