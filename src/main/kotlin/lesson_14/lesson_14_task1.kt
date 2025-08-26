package lesson_14

open class Liner(
    open val name: String,
    open val speed: Int = 500,
    open val loadCapacity: Int = 700,
    open val capacity: Int = 1500,
)

class Cargo(
    override val name: String
) : Liner(
    name = name,
    speed = 15,
    loadCapacity = 500,
    capacity = 2000
)

class Icebreaker(
    override val name: String
) : Liner(
    name = name,
    speed = 10,
    loadCapacity = 300,
    capacity = 300
) {
    fun chopIce() {
        println("$name колет лёд")
    }
}

fun main() {
    val cargo1 = Cargo("Cargo")
    println("Скорость: ${cargo1.speed}")
    println("Вместительность: ${cargo1.capacity}")
    println("Грузоподъёмность: ${cargo1.loadCapacity}")
    println()

    val icebreaker1 = Icebreaker("Icebreaker")
    println("Скорость: ${icebreaker1.speed}")
    println("Вместительность: ${icebreaker1.capacity}")
    println("Грузоподъёмность: ${icebreaker1.loadCapacity}")
    icebreaker1.chopIce()
    println()

    val liner1 = Liner("Liner")
    println("Скорость: ${liner1.speed}")
    println("Вместительность: ${liner1.capacity}")
    println("Грузоподъёмность: ${liner1.loadCapacity}")
    println()
}
