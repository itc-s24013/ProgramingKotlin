package exam03

import kotlin.random.Random

abstract class Character(val maxHp: Int,
                         var hp: Int,
                         val maxMp: Int,
                         var mp: Int,
                         open val attack: Int,
                         open val defense: Int ) {

    abstract fun attackTo(target: Character): Int

    abstract fun attacked(power: Int) : Int
}