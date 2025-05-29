package chap31

class FlyingPerson(name: String, age: Int) : Flyable, Person(name, age) {
    override fun fly() {
        println("まさか！人間が空を飛んでいます。")
    }
}