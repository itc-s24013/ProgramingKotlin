package chap30

class Prius(color: String) : Car(color) {
    //driveをコメントアウトするとエラーが出る
    //関数がないのは良くないので
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは ${distance}です。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません！")
    }
}