package chap42

import jp.ac.it_college.std.s24013.example.cars.Car

fun main() {
    val c1 = Car(color = "赤")
    val c2 = Car(color = "青")
    c1.drive()
    c2.drive()
    val c3 = jp.ac.it_college.std.s24013.example.cars.Car("白")
    c3.drive()
}