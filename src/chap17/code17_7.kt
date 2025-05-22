package chap17

fun main() {
    val a: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく")
    for ((i,x) in a.withIndex()) {
        println("$i : $x")
    }
    println("-----------------")
    a.add(2,"どうぞ")
    //a.add("お願いします")
    a += "お願いします"
    for ((i,x) in a.withIndex()) {
        println("$i : $x")
    }
}