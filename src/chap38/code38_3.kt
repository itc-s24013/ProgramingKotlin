package chap38

fun main() {
    //getCountClosureは一回しか呼び出していない。
    val closureA = getCountClosure()
    val closureB = getCountClosure()
    //returnで返されている関数しか実行していないのでnumが初期化されない。
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャBが返した値 = ${closureB()}")
    println("クロージャBが返した値 = ${closureB()}")
    println("クロージャBが返した値 = ${closureA()}")
}

fun getCountClosure(): () -> Int {
    var num = 0
    return fun() = ++num
}