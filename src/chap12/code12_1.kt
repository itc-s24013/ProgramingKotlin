package chap12

fun main() {
    val x = "Hello"
    when (x) {
        "Good Morning" -> println("おはようございます")
        "Hello" -> println("こんにちは")
        "Good Evening" -> println("こんばんは")
        else -> println("どうも！")
    }
}