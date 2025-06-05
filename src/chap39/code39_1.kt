package chap39

fun main() {
    //Double型を2つ受け取り、Double型を返す。
    //これは関数を返しているのではなく、普通に数字を返している。
    //戻り値にはfunで計算した結果を返すよ。
    val plus1: (Double,Double) -> Double = fun(x: Double, y: Double): Double {
        return x + y
    }
    val plus2: (Double, Double) -> Double = fun(x, y) = x + y
    //ラムダ式
    val plus3: (Double, Double) -> Double = {x,y -> x + y}

    val result1 = plus1(10.0,2.0)
    val result2 = plus2(10.0,2.0)
    val result3 = plus3(10.0,2.0)

    println("result1 = $result1")
    println("result2 = $result2")
    println("result3 = $result3")
}