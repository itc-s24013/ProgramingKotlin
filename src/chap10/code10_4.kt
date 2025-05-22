package chap10

fun main() {
    val rangeA: LongRange = 0..10000000000L
    val rangeB: CharRange = 'A'..'E'
    val rangeC: CharRange = 'あ'..'お'

    val flagA = 500 in rangeA
    val flagB = 'D' in rangeB
    val flagC = 'え' in rangeC

    println("flagA: $flagA")
    println("flagB: $flagB")
    println("flagC: $flagC")
}