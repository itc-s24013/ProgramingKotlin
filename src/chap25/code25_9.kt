package chap25

fun main() {
    val p1 = Person2("タケシ",7)
    p1
}

class Person2(val name:String,var age:Int){
    init {
        println("コンストラクタのイニシャライザが呼ばれました。")
        greet()
    }
    fun greet(){
        println("${name}です。${age}才です。")
    }
}