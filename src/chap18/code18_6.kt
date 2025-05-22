package chap18

fun main() {
    val x = mutableListOf("あ","い","う","え","お")
    println("コレクション内の要素数: ${x.count()}")
    x += "あ"
    x += "あ"
    x += "あ"
    println("コレクション内の要素数: ${x.count()}")

    println("---------------------")

    val y = mutableSetOf("あ","い","う","え","お")
    println("コレクション内の要素数: ${y.count()}")
    y += "あ"
    y += "あ"
    y += "あ"
    println("コレクション内の要素数: ${y.count()}")

}