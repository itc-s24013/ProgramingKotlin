package chap40

class Person2(val name: String,val age: Int) {
    // クラス内の関数で、::メソッド名とすると
    // そのメソッドを実行しているインスタンスの「メソッドを実行する関数オブジェクト」が参照できる。
    fun greet() {
        println("${name}です。${age}才です。")
        at18year(::moreYearsAt)
    }
    fun greet2() {
        at30year(::moreYearsAt)
    }
    fun moreYearsAt(year: Int): Int {
        return year - age
    }
}

fun at30year(action: (Int) -> Int) {
    println("30歳まで${action(30)}年です。")
}

fun at18year(action: (Int) -> Int) { //intを受け取ってintを返す関数を受け取る。
    println("18歳まで${action(18)}年です。")//引数に18を設定する
}

fun main() {
    val p1 = Person2("ユミ",8) //こいつのこと参照できますよ
    p1.greet()
    p1.greet2()
    println()
    val p2 = Person2("ケンタ",5) //こいつのこと参照できますよ
    p2.greet()
    p2.greet2()
}