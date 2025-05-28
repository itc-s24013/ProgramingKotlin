package chap29

import chap28.Ferrari
import chap28.Prius

fun main() {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    driveByFerrari(car1)
    println()
    driveByPrius(car2)
}

fun driveByFerrari(car: Ferrari) {
    car.drive(100.0)
}

fun driveByPrius(car: Prius) {
    car.drive(100.0)
}