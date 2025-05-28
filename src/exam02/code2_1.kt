package exam02

import kotlin.random.Random

fun main() {
    val dice = Dice(3)
    println(dice.number)
    println()
    val dice2 = Dice("サイコロ","5")
    println(dice2.number)
}

class Dice(val name:String="dice",var maxNumber:Int=6){
    init {
        roll()
    }
    constructor(name: String, maxNumber: String) : this(name,maxNumber.toInt())
    constructor(maxNumber: Int) : this("dice",maxNumber)
    var number : Int = 0
        private set
    fun roll() {
        println("${name}を振ります")
        number = Random.nextInt(1,maxNumber+1)
        println("出目は${number}です。")
    }
}
// Dice という名前でサイコロを表すクラスを定義してください
// プロパティとして識別用の名前(name)を持ちます
// roll というメソッドでサイコロを振ります。
//出た目は number というプロパティで繰り返し参照できること。
// 一般的6面サイコロ以外も対応したいので、いくつまでの数を出せるか
// コンストラクタでパラメータとして受け取れるようにしてください。