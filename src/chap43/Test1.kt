package chap43

fun main() {
    testPublic()
    //testPrivate()
    testPublic2()

    val a = TestPublic()
    //val b = TestPrivate()
    val b = a.testClass
    println(b)
}