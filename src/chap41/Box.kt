package chap41

class Box<T> { //このTは変数みたいなもん(型が入るよ)。ちなみにTじゃなくてもいい。
    var label: String = ""
    var content: T? = null //T型(null許容)の変数contentの宣言

    fun setValues(label: String, content: T) {
        this.label = label
        this.content = content
    }

    fun printValues() {
        println("$label : $content")
    }
}