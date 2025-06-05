package chap39

fun main() {
    val list = listOf("あ","い","う","え","お")
    //無名関数
    //Unitは戻り値がない。 String型を受取り、表示する。
    val action1: (String) -> Unit = fun(x) {
        println(x)
    }
    list.forEach(action1) //listの要素1つずつに関数を実行する。

    val action2 = fun(x: String) { //これでも行ける。
        println(x)
    }
    list.forEach(action2)

    //ラムダ式
    list.forEach { println(it) } //省略版
}