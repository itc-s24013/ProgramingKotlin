package chap32

fun main() {
    var text: String? = "あいうえお"
    text = null
    println("文字列「$text」の長さ = ${text?.length}") //textがnullの時点でlengthは呼び出されない。
    // 32.5
    val textA: String = "あいうえお"
    val textB: String? = null
    val lengthA = countTextLength1(textA)
    val lengthB = countTextLength2(textB)
    //text_bに入っているのがnullでなくてもnullが入る可能性があるからエラー出る
    //後ろに!!を付けることで一時的にnull許容型ではなくなる。
    //var length_n = countTextLength2(null)
    println("lengthA = $lengthA")
    println("lengthB = $lengthB")
}

fun countTextLength1(text: String) : Int {
    return text.length
}

fun countTextLength2(text: String?) : Int { //こっちはnull許容型
    return text?.length ?: 0 //32.11
    //textがnullの時点でlengthは呼び出されない。
    // (?:)はエルビス演算子で、直前に書かれた式がnull以外ならそのまま返し、nullなら後ろの値を返すという意味。
}