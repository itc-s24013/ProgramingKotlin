package chap19

fun main() {
    val map: MutableMap<String, String> = mutableMapOf("Pen" to "ペン")
    println(map)
    map.put("Apple","アップル")
    map += "Pineapple" to "パイナップル"
    val value1 = map["Pen"]
    val value2 = map["Pineapple"]
    val value3 = map["Apple"]
    val value4 = map["Pen"]
    println("$value1、 $value2、 $value3、 $value4")
    println(map)

    // コード19.5
    println("---------------------------------------------")
    map.remove("Pen")
    println(map)
    map -= "Pineapple"
    println(map)
}