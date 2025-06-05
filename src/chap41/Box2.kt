package chap41

internal class Box2<L, C> {
    var label: L? = null
    var content: C? = null
    fun setValues(label: L, content: C) {
        this.label = label
        this.content = content
    }

    fun printValues() {
        println("$label : $content")
    }
}
