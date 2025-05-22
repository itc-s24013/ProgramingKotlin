package exam01

/**
 * キーボードから数字を入力して、1から入力された数目での
 * FizzBuzz を出力します。
 *
 * FizzBuzz とは、
 * 3の倍数のときに Fizz
 * 5の倍数のときに Buzz
 * 3と5の倍数のときに FizzBuzz
 * それ以外のときは 数字をそのまま出力する
 * よくあるプログラムの練習問題です。
 */
fun main() {
    print("数字を入力してください:")
    var a = readln()
    while(true) {
        try {
            val b: Int = a.toInt()
            break
        } catch (e: NumberFormatException) {
            print("数字を入力してください:")
            a = readln()
        }
    }
    (1..a.toInt()).forEach {
//        if ( it % 3 == 0 && it % 5 == 0) {
//            println("FizzBuzz")
//        } else if (it % 5 == 0) {
//            println("Buzz")
//        } else if (it % 3 == 0) {
//            println("Fizz")
//        } else {
//            println(it)
//        }
        val result = if (it % 15 == 0) {
            "FizzBuzz"
        } else if (it % 3 == 0) {
            "Fizz"
        } else if (it % 5 == 0) {
            "Buzz"
        } else {
            it.toString()
        }
        println(result)
    }
//    println("数字を入力してください")
//    val x = readln().toInt()
//    for (i in 1..x) {
//        if (i % 3 == 0 && i % 5 == 0)
//            println("FizzBuzz")
//        else if (i % 5 == 0) {
//            println("Buzz")
//        }
//        else if (i % 3 == 0) {
//            println("Fizz")
//        }
//        else {
//            println(i)
//        }
    //}
}