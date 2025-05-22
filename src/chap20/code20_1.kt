package chap20

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("なにか入力してください:")
    val line = scanner.nextLine()
    println(line)

    print("なにか入力してください(空白はダメ):")
    val string = scanner.next()
    println(string)

    print("整数を入力してください:")
    val num = scanner.nextInt()
    println("${num}の2倍の数: ${num * 2}")
}