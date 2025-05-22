package chap11

fun main() {
    val age = 15

    if (age in 13..15) {
        println("中学生です")
    } else {
        println("中学生ではありません")
    }
}