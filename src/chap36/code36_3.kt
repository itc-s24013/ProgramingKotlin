package chap36

fun main() {
    val p = Person2()
    p.setNameAndAge("タケシ",5)
    p.greet()
}

class Person2 {
    var name = ""
    var age = 0

    fun setNameAndAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun greet() {
        println("${name}です。${age}才です。")
    }

    fun hoge() {
        val under20 =
        if (age < 20) {
            true
        } else {
            false
        }
        println(under20)
        if (under20) {
            println("20才未満です")
        }
    }
}