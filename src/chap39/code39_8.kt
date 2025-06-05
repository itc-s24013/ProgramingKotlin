package chap39

import kotlin.random.Random

fun main() {
    //ラムダ式で受け取る引数が1つしかないのでitで書くことが可能。
    //int型とラムダ式をrandomNumberCalculateに渡している。
    randomNumberCalculate(6){
        it * 2
    }
    randomNumberCalculate(100) {
        val square = it * it
        val cubic = square * it
        cubic
    }
}

//一番最後の引数が関数でかつそれがラムダ式で記述される場合は呼び出しの際()の外にラムダ式を書くことが可能。
fun randomNumberCalculate(max: Int, calculator: (Int) -> Int) {
    val targetNumber = Random.nextInt(max+1)
    val result = calculator(targetNumber)
    println("計算結果:$result")
}