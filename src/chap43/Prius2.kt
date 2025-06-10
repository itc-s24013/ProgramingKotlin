package chap43

class Prius2(color: String) : Car2(color) {
    override fun letEngineWork() {
        println("スイーン！")
        // public なプロパティの protected なセッターを呼び出す。
        fuel -= 0.5 //Car2のサブクラスなのでこのクラスではsetが有効になっている。
    }
}