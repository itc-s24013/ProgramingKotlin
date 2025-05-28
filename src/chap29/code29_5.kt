package chap29

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByCar2(car1)
    println()
    driveByCar2(car2)
}

fun driveByCar2(car: Car) {
    car.drive(100.0)
}