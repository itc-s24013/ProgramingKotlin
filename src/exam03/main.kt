package exam03

fun main() {
    val human = Human(20,3,60,3,60,90,6,2)
    val enemy = Enemy(3,70,5,2,29,4)
    human.attackTo(enemy)
    println()
    enemy.attackTo(human)
}