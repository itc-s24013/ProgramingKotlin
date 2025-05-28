package chap30

abstract class Car(val color: String) {
    var distance = 0.0
    abstract fun drive(d: Double)
}