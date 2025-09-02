package lesson_16

import kotlin.math.max
import kotlin.math.min

const val HEALTH = 100

class Player(
    val name: String,
    private var health: Int = HEALTH,
    var impactForce: Int,
    private var isAlive: Boolean = true,
) {
    private fun death() {
        health = 0
        impactForce = 0
        isAlive = false
        println("Вы умерли!")
    }

    fun takingDamage(damage: Int) {
        if (isAlive) {
            health = max(0, health - damage)
            println("$name получил урон $damage, здоровье: $health")
            if (health <= 0) {
                death()
            }
        } else {
            println("Игрок мертв")
        }

    }

    fun getCured(amount: Int) {
        if (isAlive) {
            health = min(HEALTH, health + amount)
            println("$name вылечился на $amount, здоровье: $health")
        } else {
            println("Нельзя лечить мертвого")
        }
    }

}

fun main() {
    val player = Player(
        "Pavel",
        100,
        10
    )
    player.takingDamage(10)
    player.getCured(15)
    player.takingDamage(90)
    player.getCured(5)
    player.takingDamage(20)
    player.getCured(5)

}