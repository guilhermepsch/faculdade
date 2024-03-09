package br.udesc.ddm.kotlin.tipogenerico

class Box<T> {
    private var t: T? = null
    fun set(t: T) {
        this.t = t
    }

    fun get(): T? {
        return t
    }

    companion object {
        fun main() {
            val integerBox = Box<Int>()
            val stringBox = Box<String>()
            integerBox.set(10)
            stringBox.set("Hello World")

            println(integerBox.get())
            println(stringBox.get())
        }
    }
}

fun main(){
    Box.main()
}