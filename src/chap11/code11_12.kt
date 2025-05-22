package chap11

fun main() {
    val age = 14

    //ブロックで代入するものは型を統一しなければならない
    val message = if (age in 13..15) { //初期値として処理結果を入れられる上、書き換えが起こらない。
        println("1番目の条件の処理が行われました。")
        "中学生です。" //ブロックの最後の行が代入される
    } else {
        println("1番目の条件の処理が行われました。")
        "中学生ではありません。"
    }
    println(message)
}