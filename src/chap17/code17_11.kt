package chap17

fun main() {
    //val a = mutableListOf(1,2,3,4,5)
    val a: MutableList<Int> = mutableListOf(1,2,3,4,5)

    //val  b = mutableListOf() //だめ
    val b: MutableList<Int> = mutableListOf(1,2,3,4,5)
    val c = mutableListOf<Int>()
}