package chap10

fun main() {
    //val rangeA = 0..10
    val rangeA = 0..< 10
    val max = 5
    val rangeB = 0..< max
    val rangeC = 0..max - 1

    println("9  in rangeA: ${9 in rangeA}")
    println("10 in rangeB: ${10 in rangeB}")
    println("4  in rangeB: ${4 in rangeB}")
    println("5  in rangeB: ${5 in rangeB}")
    println("4  in rangeC: ${4 in rangeC}")
    println("5  in rangeC: ${5 in rangeC}")
}