package chap05

fun main() {
    val h: Int = 8
    val message1 = "本日働いた時間は、${h}hours"
    val message2 = "このペースで１ヶ月間毎日働くと、${h*30}hours の労働になります。"
    val message3 = "このペースで１年間毎日働くと、${h * 365}hours の労働になります。"
    println(message1)
    println(message2)
    println(message3)
}