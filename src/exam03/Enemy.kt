package exam03

import kotlin.random.Random

class Enemy(
    maxHp: Int,
    hp: Int,
    maxMp: Int,
    mp: Int,
    attack: Int,
    defense: Int
):
    Character(maxHp,hp,maxMp,mp,attack,defense) {
    override fun attackTo(target: Character): Int {
        println("エネミーの攻撃！:${attack}")
        target.attacked(attack)
        return attack
    }

    override fun attacked(power: Int): Int {
        val damage = ((power * 0.5) - (defense * 0.25)) * (Random.nextInt(28, 36 + 1) / 32)
        println("エネミーはダメージを受けた！:${damage.toInt()}")
        hp -= damage.toInt()
        println("エネミーの残りHP:${hp}")
        return damage.toInt()
    }
}