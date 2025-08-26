package lesson_14

open class Liner(
    val name: String,
    val speed: Int = 500,
    val loadCapacity: Int = 700,
    val capacity: Int = 1500,
)

class Cargo(
    name: String,
    speed: Int = 400,
    loadCapacity: Int = 2000,
    capacity: Int = 500,
) : Liner(name, speed, loadCapacity, capacity)

class Icebreaker(
    name: String,
    speed: Int = 300,
    loadCapacity: Int = 500,
    capacity: Int = 400,
    ) : Liner(name, speed, loadCapacity, capacity) {
    fun chopIce() {
        println("$name колит лёд")
    }
}

fun main() {
    val cargo1 = Cargo("cargo1")
    println("Скорость: ${cargo1.speed}")
    println("Вместительность: ${cargo1.capacity}")
    println("Грузоподъёмность: ${cargo1.loadCapacity}")
    println()

    val icebreaker1 = Icebreaker("icebreaker1")
    println("Скорость: ${icebreaker1.speed}")
    println("Вместительность: ${icebreaker1.capacity}")
    println("Грузоподъёмность: ${icebreaker1.loadCapacity}")
    icebreaker1.chopIce()
    println()

    val liner1 = Liner("liner1")
    println("Скорость: ${liner1.speed}")
    println("Вместительность: ${liner1.capacity}")
    println("Грузоподъёмность: ${liner1.loadCapacity}")
    println()
}
