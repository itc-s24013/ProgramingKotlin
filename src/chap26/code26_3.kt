package chap26

fun main() {
    val p = Person(7)
    println()
    val p2 = Person("鈴木","タロウ")
}

class Person(val name:String, var age:Int){
    init {
        println("プライマリコンストラクタのイニシャライザが呼ばれました。")
        println("指定されたパラメータは $name と $age です。")
    }
    constructor(age:Int) : this("名無しさん",age) {
        println("年齢だけを指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
    }

    constructor(lastName: String, firstName: String) : this("$lastName $firstName",20) {
        println("名字と名前を指定するセカンダリコンストラクタのイニシャライザが呼ばれました。")
    }
}