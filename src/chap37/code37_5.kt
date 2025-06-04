package chap37

fun main() {
    //1つ目の=は変数に入れるための=
    // 2つ目の=は処理結果を返すための=
    val p1 = fun(x: Double, y: Double) = x + y
    val p2 = fun(x: Double, y: Double) : Double = x + y
    val p3 = fun(x: Double, y: Double) : Double { //波括弧使うと戻り値の型は省略できない。returnで返さないといけない。
        return x + y
    }
    val p4: (Double, Double) -> Double = fun(x: Double,y: Double): Double {
        return x + y
    }
    val p5: (Double, Double) -> Double = fun(x,y) = x + y

    printRandomValueCalculation(p1)
    printRandomValueCalculation(p2)
    printRandomValueCalculation(p3)
    printRandomValueCalculation(p4)
    printRandomValueCalculation(p5)
}