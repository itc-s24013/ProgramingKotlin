package chap21

fun main() {
    getTimes2(2,3,4)
}

fun getTimes2(x: Int, y: Int, z: Int) {
    println("パラメータとして、$x と $y と $z を受け取りました。")
    println("これらの値を全部掛け算した答えは ${x * y * z}です。")
}