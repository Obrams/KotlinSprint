package lesson_14

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
