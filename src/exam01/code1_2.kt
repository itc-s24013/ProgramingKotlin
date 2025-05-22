package exam01

/**
 * 映画館の料金を計算するプログラム
 * シニア → 一般 → 子供 の順で人数を入力して
 * シニア: 1,300円 一般: 2,000円 子供: 1,000円
 * ただし、10名以上の場合は、各200円割引
 */
fun main() {
    print("シニアの人数を入力してください:")
    val sinia = readln().toInt()
    print("一般の人数を入力してください:")
    val ippan = readln().toInt()
    print("子供の人数を入力してください:")
    val kids = readln().toInt()
    val result= if (sinia + ippan + kids >= 10) {
        "料金は${(sinia * 1100) + (ippan * 1800) + (kids * 800)}円です。"
    } else {
        "料金は${(sinia * 1300) + (ippan * 2000) + (kids * 1000)}円です。"
    }
    println(result)
}