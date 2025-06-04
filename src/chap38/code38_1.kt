package chap38

fun main() {
    val c1 = getTextClosure("さん")
    val c2 = getTextClosure("くん")
    val c3 = getTextClosure("ちゃん")

    println(c1("タケシ"))
    println(c2("タケシ"))
    println(c3("タケシ"))
}

fun getTextClosure(x: String): (String) -> String { //xを受けとるとStringを受け取って「Stringを返す関数」を返すよ
    return fun(name) = name + x //引数nameの後ろにxを付け足してくれる関数
}
/*
* getTextClosureは値を返した後消えるのでxは本来使えなくなっているはず。
* c*はgetTextClosureの戻り値が返ってきているだけでスコープ外。
* nameは新しく引数として受け取るので問題ないが、xはgetTextClosureで引数として受け取っている。
* 関数を返したあとはgetTextClosureはメモリの中から消える。
* 戻り値として必要な変数はすぐには消えずに少し寿命が伸びる。
*/