package chap37

fun main() {
    //こいつらには+か-の計算が出来る関数が入る。
    val calculator1 = getCalculator("+")
    val calculator2 = getCalculator("-")
    //こいつらには計算結果が入る。
    val result1 = calculator1(10.0,2.0)
    val result2 = calculator2(10.0,2.0)
    println(result1)
    println(result2)
}

fun getCalculator(type: String): (Double, Double) -> Double { //引数としてtypeを受け取り、戻り値としてDouble型を2つ受取りDouble型を返す関数を返す。
    val p = fun(x: Double, y: Double) = x + y
    val m = fun(x: Double, y: Double) = x - y

    return when (type) { //ここでは関数を返している。
        "+" -> p
        else -> m
    }
}