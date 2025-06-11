package chap44

import java.awt.SystemColor.text

fun main() {
    val text = "勉強"
    val message = text.getOneTwoFiveMessage()
    println(message)
    println(text.oneTwoFiveMessage1)
}
//拡張関数(String型の変数に使うことが出来る。String型の中の関数みたいになる。)
fun String.getOneTwoFiveMessage(): String =  "一に${this}、二に${this}、三、四、が無くて五に${this}" //こいつはどこからでも呼び出す時に候補で出てくる。


//javaに変換したときに↓のゲッターと↑のメソッド名が被ることになるのでエラーが出る。
val String.oneTwoFiveMessage1: String
    get()= "一に${this}、二に${this}、三、四、が無くて五に${this}" //パッキングフィールドに突っ込んでる。