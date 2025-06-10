package chap43

open class Car(val color: String) {
    protected var fuel = 50.0

    public fun drive() { //publicは書かなくてもいい。
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました。")
        } else {
            println("ガス欠で、走れません")
        }
    }

    protected open fun letEngineWork() { //privateにopen作ると怒られる。
        println("ブルルーン!")
        fuel -= 1.0
    }
}