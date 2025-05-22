package chap07

fun main() {
    val delicios = true
    val cheap = false
    println("このレストランは美味しい: $delicios")
    println("このレストランは安い: $cheap")
    val letsEat = delicios || cheap
    println("食事する?: $letsEat")
}