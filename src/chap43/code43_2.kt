package chap43

fun main() {
    val car = Prius1("赤")
    car.drive()
}

open class Car1(val color: String) {
    protected var fuel = 50.0
    public fun drive() {
        if (fuel>0.0) {
            letEngineWork()
            println("${color}の車が走りました。")
        } else {
            println("ガス欠で、走れません！")
        }
    }

    protected open fun letEngineWork() {
        println("ブルルーン！")
        fuel = fuel - 1.0
    }
}

class Prius1(color: String) : Car1(color) {
    override fun letEngineWork() {
        println("スイーン！")
        fuel = fuel - 0.5
    }
}