package exam01

import kotlin.random.Random
import kotlin.random.nextInt

/**
 * お釣りの金種計算
 * ランダムで100 ~ 9000の数値を生成します。
 * 支払う金額をキーボードから入力します。
 * お釣りを計算して、金種ごとにその枚数を出力してください。
 * トータルの枚数は最小となる組み合わせでお釣りを返し
 * 支払う金額が足りない場合は、「足りません」と出力してください。
 */
fun main() {
    val money: List<Int> = listOf(1, 5, 10, 50, 100, 500, 1000, 5000)
    val price = Random.nextInt(100..9000)
    println("お会計は${price}円です")
    val siharai = readln().toInt()
    if (siharai < price) {
        println("足りません")
    } else if (siharai == price) {
        println("お釣りは出ません。")
    } else{
        var oturi = siharai - price
        do {
            for (i in money.count() -1  downTo 0) {
                if (oturi / money[i] > 0 ) {
                    println("${money[i]}円が${oturi / money[i]}枚")
                    oturi = oturi % money[i]
                } else {
                    continue
                }
            }
        } while (oturi > 0)
    }
}