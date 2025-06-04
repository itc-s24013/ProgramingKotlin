package chap38

fun main() {
    var x = ""

    x = "さん"
    val c1 = fun(name: String) = name + x

    x = "くん"
    val c2 = fun(name: String) = name + x

    x = "ちゃん"
    val c3 = fun(name: String) = name + x

    println(c1("タケシ"))
    println(c2("タケシ"))
    println(c3("タケシ"))
}