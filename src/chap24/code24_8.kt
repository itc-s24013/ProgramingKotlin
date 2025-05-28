package chap24

fun main() {
    val p = Person2()
    p.name = "タケシ"
    p.age = 5
    println("p.age の値: ${p.age}")
    p.textAge = "30"
    println("p.age の値: ${p.age}")
    println(p.textAge)
}

class Person2 {
    var name: String = ""
    var age: Int = 0
    var textAge: String
        set(value) {
            age = value.toInt()
        }
        get() {
            return age.toString()
        }
}