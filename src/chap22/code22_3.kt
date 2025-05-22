package chap22

fun main() {
    val text = readln()
    try {
        val number = text.toInt()
        println("number = $number")
    } catch (e: NumberFormatException) {
        println("「${text}」という文字は数値に変換できません。")
    }
}