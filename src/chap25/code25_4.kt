package chap25

fun main() {
    val p = Person("タケシ",5)
    p.greet()
    val p1 = Person("名無しさん")
    p1.greet()
}

class Person (val name: String = "",var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}才です。")
    }
}