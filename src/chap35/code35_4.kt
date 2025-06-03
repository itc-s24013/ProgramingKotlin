package chap35

class Person2(val name: String, val myNumber: Int) {
    override fun equals(other: Any?): Boolean {
        if (other != null //与えられたものがnullではない。
            && other is Person2 //与えられたものがPerson2のインスタンス。
            && this.name == other.name
            && this.myNumber == other.myNumber) {
            return true
        }
        return false
    }
    /*
    * this と other の違い
    * this: equals メソッドが呼び出されている**現在のオブジェクト（インスタンス）**を指します。
    * 例: person1.equals(person2) と呼び出した場合、person1 が this になります。
    * other: equals メソッドの引数として渡された**別のオブジェクト（インスタンス）**を指します。
    *
    * 例: person1.equals(person2) と呼び出した場合、person2 が other になります。
    */
}
fun main() {
    val p1 = Person2("タケシ", 1234)
    val p2 = Person2("タケシ", 1234)

    println("p1のハッシュコード: ${p1.hashCode()}")
    println("p2のハッシュコード: ${p2.hashCode()}")

    if (p1 == p2) {
        println("二人は同一人物")
    } else {
        println("二人は別人")
    }

    val textSet = setOf("あいうえお","かきくけこ","あいうえお")
    println("textSet: $textSet")
    val person2Set = setOf(p1,p2)
    println("person2Set: $person2Set") //こいつはhashコードで同一のインスタンスなのかを調べるのでp1とp2の両方ともリストに含まれる。
}