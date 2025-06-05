package chap41

fun main() {
    val box1 = Box<String>()
    val box2 = Box<Int>()
    box1.setValues("文字列ですよ","あいうえお")
    box2.setValues("整数ですよ",1000)
    box1.printValues()
    box2.printValues()
}