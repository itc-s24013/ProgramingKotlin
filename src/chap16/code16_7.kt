package chap16

fun main() {
    val a: IntArray = intArrayOf(
        1000, 1200, 1500, 1800, 2400, 3000, 3800
    )
    for ((index,money )in a.withIndex()) {
        println("${index + 1}年目の時給は${money}円です。")
    }
}