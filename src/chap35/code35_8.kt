package chap35

data class Person(val name: String, val myNumber: Int)
/*
* データクラスにすることで、プロパティの値がすべて同じならハッシュ値も同じになる。
* そして、プロパティの値が違うものがあればハッシュ値も別のものになる。
* あと、toString書かなくてもプロパティの値とクラス名が見やすいように表示される。
*/

fun main() {
    val p1 = Person("タケシ",1234)
    val p2 = Person("タケシ",1234)

    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")

    if (p1 == p2) {
        println("二人は同一人物です。")
    } else {
        println("二人は別人です。")
    }
    val personSet = mutableSetOf(p1,p2)
    println("personSet: $personSet")
}