package chap31

open class Person(val name: String, val age: Int) {
    fun greet() {
        println("${name}です。${age}才です。")
    }
}