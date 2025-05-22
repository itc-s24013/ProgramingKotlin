package chap17

fun main() {
    val a: List<Int> = listOf(1000, 1200, 1500)

    // インデックス指定
    println("1年目の時給は${a[0]}です。")
    println("2年目の時給は${a[1]}です。")
    println("3年目の時給は${a[2]}です。")

    // ループ
    for (money in a) {
        println("時給は${money}です。")
    }

    // インデックス付きループ
    for ((index,money )in a.withIndex()) {
        println("${index + 1}年目の時給は${money}です。")
    }
}