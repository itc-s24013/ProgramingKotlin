package chap05

fun main() {
    val message = """|
        |こんにちは、世界！
        |私はKotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことが出来ます。
        |皆さん、一緒に楽しくプログラミングしましょう！
    """.trimMargin()
    println(message)
    println("----------------------------------------------")
    val message2 = """
        こんにちは、世界！
        私はKotlinに関して勉強しています。
        Kotlinでは、とても簡潔なプログラムを書くことが出来ます。
        皆さん、一緒に楽しくプログラミングしましょう！
    """.trimIndent()
    println(message2)
}