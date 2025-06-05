package chap39

fun main() {
    //Stringを1つ受け取ってStringを返す。
    val function1: (String) -> String = fun(x: String): String {
        return x + "ちゃん"
    }
    val function2: (String) -> String = fun(x: String) = x + "ちゃん"
    //ラムダ式
    //xを受け取ってx+"ちゃん"で返す。
    val function3: (String) -> String = {x -> x + "ちゃん"}
    //受け取った引数をitで置き換えが可能。(引数が1つの場合のみ)
    val function4: (String) -> String = {it + "ちゃん"}

    println(function1("タケシ"))
    println(function2("タケシ"))
    println(function3("タケシ"))
    println(function4("タケシ"))
}