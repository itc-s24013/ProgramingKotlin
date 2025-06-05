package chap40


class Person(val name: String, val age: Int) {
    fun greet() {
        println("${name}です。${age}才です")
    }

    fun displayName(): String {
        return "${name}($age)"
    }
}
fun main() {
    val p1 = Person("タケシ", 5)
    val p2 = Person("ケンタ",5)
    val p3 = Person("ユミ",8)
    val list = listOf(p1,p2,p3)
    //val pMax = list.maxBy{ p: Person -> p.age} //Personのインスタンスであるpのageが比較対象。関数で指定する。ラムダ式
    //Person::age ==> fun(p1:Person) = p1.age
    val pMax = list.maxBy(Person::age) //メンバ参照(Personのインスタンスを受け取ってプロパティを返す。)
    println("最年長なのは誰?")
    pMax.greet()
    // Person::displayName ==> fun(p1:Person) = p1.displayName
    val getPersonDisplayName = Person::displayName //最年長しか入っていないpMaxの中のdisplayName関数を呼び出す。
    println(getPersonDisplayName(pMax)) //ここにp1が補足で入るのは本来引数を受け取らない関数に引数を渡さないといけなくなったので緊急でp1が入る
}