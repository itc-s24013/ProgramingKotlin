package chap21

fun main() {
    val answer: Int = getThreeTimes(5)
    println(answer)
}

// 下記が関数の定義
fun getThreeTimes(value: Int): Int {
    return value * 3
}