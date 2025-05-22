package chap07

fun main() {
    println("true xor true:${true xor true}")
    println("true xor false:${true xor false}")
    println("false xor true:${true xor false}")
    println("false xor false:${false xor false}")

    val a = true
    val b = false

    println(!a && !b == !(a || b))
    println(!a || !b == !(a && b))
}