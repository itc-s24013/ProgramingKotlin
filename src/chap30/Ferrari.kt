package chap30

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) { //表面上では変わったように見えるが内部的には変わらないため上書きとは少し違う
        distance += d
        println("${color}のフェラーリが走っています！ブウォォォーン！")
        println("おおっ、かっこいい！！！")
        println("マイレージは ${distance}キロになったぜい！")
    }
}