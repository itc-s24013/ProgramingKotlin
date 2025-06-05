package chap39

fun main() {
    //ラムダ式
    printResult({x, y -> x + y})
    printResult(){x, y -> x + y}
    printResult{x, y -> x + y}
}

fun printResult(calculator: (Double,Double) -> Double) { //「引数としてDouble型を2つ受け取ったあとDouble型を返す関数」を引数として受け取りますよ。
    val result = calculator(10.0,2.0)
    println("計算結果: $result")
}