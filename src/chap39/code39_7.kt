package chap39

import kotlin.random.Random

fun main() {
    val randomSuffix = nameString()
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
    println(randomSuffix("タケシ"))
}

//itはここの引数としてStringを受け取り、Stringを返す関数での受け取ったStringのこと。
fun nameString() : (String) -> String {
    //ラムダ式を返している。
    return {
        //ラムダ式はreturnを書かなくても勝手に返してくれる。
        val randomNumber = Random.nextInt(100)
        it + randomNumber
    }
}

fun hoge(name: String): String = name + "ちゃん" //これは単一式なのでreturntいらない。
val hoge2: (String) -> String = {it + "ちゃん"} //これはラムダ式なので勝手に最後の結果を返す。