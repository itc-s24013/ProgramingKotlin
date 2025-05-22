package chap11

import kotlin.random.Random

fun main() {
    val score = Random.nextInt(0, 100)
    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90

    val judge = if (score in 0..< borderC){
        "D"
    } else if (score in borderC..< borderB){
        "C"
    } else if (score in borderB..< borderA){
        "B"
    } else if (score in borderA..< borderS){
        "A"
    } else {
        "S"
    }

    println("$judge:$score")
}