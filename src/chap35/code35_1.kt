package chap35

class Person1(val name: String, val myNumber: Int)

fun main() {
    val p1 = Person1("タケシ", 1234)
    val p2 = Person1("ケンタ",5678)

    if (p1 == p2) {
        println("二人は同一人物")
    } else {
        println("二人は別人")
    }

    val p3 = Person1("タケシ",1234)
    if (p1 == p3) {
        println("p1 と p3 は同一人物")
    } else {
        println("p1 と p3 は別人")
    }
}