package chap36

fun main() {
    val p = Person1()
    p.greet()
    println(p.name)
}

class Person1 {
    var name = "名無しさん"
    var age = 0
    fun greet() {
        val name = "ヒロシ" //ここで新しくnameを宣言しているのでメンバ変数は変わっていない。
        val age = 46
        println("${name}です。 ${age}才です。")
    }
}