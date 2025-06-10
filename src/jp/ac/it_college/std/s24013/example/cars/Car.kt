package jp.ac.it_college.std.s24013.example.cars //このパッケージの「.」は「/」として見られるので階層が深くなる。

open class Car(val color: String) {
    open fun drive() {
        println("${color}の車が走っています。")
    }
}