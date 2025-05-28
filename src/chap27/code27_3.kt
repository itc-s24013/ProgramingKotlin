package chap27

class Ferrari(c: String) : Car(c) //ここにvar,valをつけないのは継承元のプロパティを使っているから
//コンストラクタでvar,valを使わない場合はプロパティとして扱われず関数の処理が終わったら消える。

fun main() {
    val car = Ferrari("赤")
    car.drive(5.0)
    car.drive(10.0)
}