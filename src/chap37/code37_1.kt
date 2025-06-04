package chap37

import kotlin.random.Random

fun main() {
    val p = ::calculatePlus
    val m = ::calculateMinus
    printRandomValueCalculation (p)
    printRandomValueCalculation (m)
}
//関数は基本的に実行して終了するまでの間メモリに残る。
fun calculatePlus(x: Double, y: Double) = x + y
fun calculateMinus(x: Double, y: Double) = x - y

fun printRandomValueCalculation(calculator: (Double,Double) -> Double) { //Double型を受け取ってDouble型の値を返す。
    val x = Random.nextDouble()
    val y = Random.nextDouble()
    val result = calculator(x,y)
    println("計算結果は${result}です。")
}