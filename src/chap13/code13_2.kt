package chap13

fun main() {
    val x = 5
    for (i in 1..9) { //1から9を一つずつ取り出してね
        println("${x}かける${i}は、${x * i}です。")
    }
}