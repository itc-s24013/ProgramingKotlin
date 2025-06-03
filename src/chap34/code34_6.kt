package chap34

import kotlin.math.sqrt

fun main() {
    val number1 = null
    val number2 = 10

    printSquare(number1)
    printSquare(number2)
}

fun printSquare(square: Int?) {
    if (square == null) {
        println("null なのでなにもしない")
        return //ここにreturnがあるおかげで中身がnullの場合は最後まで処理がされずここで終わるので安全に終了する
    }
    val result = sqrt((square * square * square).toDouble())
    println("${square}を3乗した数は${result}です。")
}