package chap41

class  Box3<L,C>(val label:L? = null, val content:C? = null) { //ここのnullはただの初期値なのでインスタンスの生成の時指定したら大人しく入ってくれる。
}

fun main() {
    val box = Box3("ラベル",123) //型の推測が可能なので型を書かなくてもいい。
    println(box.label)
    println(box.content)
}