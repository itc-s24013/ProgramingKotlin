package chap31

open class Car(val color: String) {
    var distance = 0.0

    open fun drive(d: Double) {
        println("${color}の車が ${d}km走りました。")
        println("その結果、マイレージは ${distance}キロになりました。")
    }
}