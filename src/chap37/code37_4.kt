package chap37

fun main() {
    //これなら実行すれば関数がメモリから消える。
    //無名関数
    val p = fun(x: Double, y: Double) = x + y
    val m = fun(x: Double, y: Double) = x - y
    printRandomValueCalculation(p)
    printRandomValueCalculation(m)
}