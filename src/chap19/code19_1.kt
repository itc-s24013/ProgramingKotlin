package chap19

fun main() {
    val map: Map<String, String> = mapOf(
        "Pen" to "ペン",
        "Apple" to "アップル",
        "Pineapple" to "パイナップル"
    )
    val value1 = map["Pen"]
    val value3 = map["Pineapple"]
    val value2 = map["Apple"]
    val value4 = map["Pen"]
    println("$value1、$value3、$value2、$value4")
}