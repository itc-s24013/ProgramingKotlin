package chap43

public fun testPublic() {
    println("可能性修飾子が public です。")
}

private fun testPrivate() {
    println("可能性修飾子が private です。")
}

fun testPublic2() {
    println("public な関数から private の関数を呼び出す")
    // 同じファイルなら private な関数も呼び出せる
    testPrivate()
}

public class TestPublic() {
    private val privateObject = TestPrivate()
    val testClass : TestAbstract = privateObject //TestAbstract型の変数testClassにTestAbstractのサブクラスであるprivateObjectを入れる。
    //TestPrivateのインスタンスとしてではなく、TestAbstractのインスタンスとして公開する。
}

abstract class TestAbstract

private class TestPrivate() : TestAbstract()