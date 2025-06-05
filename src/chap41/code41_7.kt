package chap41

fun main() {
    val box1 = Box2<Int, String>()
    val box2 = Box2<String, Double>()
    box1.setValues(500,"ごひゃく")
    box2.setValues("pi",3.14)
    box1.printValues()
    box2.printValues()
}