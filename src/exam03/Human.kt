package exam03

import kotlin.random.Random

class Human(val strength: Int,
            val stamina: Int,
            val weapon: Int,
            val armor: Int,
            maxHp: Int,
            hp: Int,
            maxMp: Int,
            mp: Int,
            override val attack: Int = strength + weapon,
            override val defense: Int = stamina + armor
):
    Character(maxHp,hp,maxMp,mp,attack,defense) {
    override fun attackTo(target: Character): Int {
        println("エネミーを攻撃した！:${attack}")
        target.attacked(attack)
        return attack
    }

    override fun attacked(power: Int): Int {
        val damage = ((power * 0.5) - (defense * 0.25)) * (Random.nextInt(28, 36 + 1) / 32)
        println("ダメージを受けた！:${damage.toInt()}")
        hp -= damage.toInt()
        println("残りHP:${hp}")
        return damage.toInt()
    }
}