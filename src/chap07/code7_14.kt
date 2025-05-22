package chap07

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(from = 0, until = 100)
//    if(a >= 0 && a <= 59) {
//        println("D:$a")
//    }
//    else if(a >= 60 && a <= 69) {
//        println("C:$a")
//    }
//    else if(a >= 70 && a <= 79) {
//        println("B:$a")
//    }
//    else if(a >= 80 && a <= 89) {
//        println("A:$a")
//    }
//    else{
//        println("S:$a")
//    }

    //論理演算子を使わないことで効率が良くなる
    if (a < 60) {
        println("D:$a")
    } else if (a < 70) {
        println("C:$a")
    } else if (a < 80) {
        println("B:$a")
    } else if (a < 90) {
        println("A:$a")
    } else {
        println("S:$a")
    }
}

