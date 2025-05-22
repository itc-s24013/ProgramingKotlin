package chap50

// code13_2を置き換えてみる
fun main() {
    val x = 5
    (1..9).forEach {
        println("${x}かける${it}は${x * it}です。")
    }
}