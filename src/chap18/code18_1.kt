package chap18

fun main() {
    val s: Set<String> = setOf("あ","い","う","え","お")
    println(s)
    for (x in s) {
        println(x)
    }
    // println(s[0]) //これは順番という概念がないので不可能
}