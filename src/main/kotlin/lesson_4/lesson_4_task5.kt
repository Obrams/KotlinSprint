package lesson_4

const val MIN_PEOPLE = 55
const val MIN_COUNT_PROVISIONS = 50
const val MAX_PEOPLE = 70

fun main() {
    println("Есть ли повреждения? (true/false): ")
    val hasDamage = readln().toBoolean()
    println("Сколько членов экипажа?")
    val crewCount = readln().toInt()
    println("Сколько ящиков провизии?")
    val provisionsBoxes = readln().toInt()

    val canSail =
        (!hasDamage && crewCount in MIN_PEOPLE..MAX_PEOPLE && provisionsBoxes > MIN_COUNT_PROVISIONS) ||
                (hasDamage && crewCount == MAX_PEOPLE && provisionsBoxes >= MIN_COUNT_PROVISIONS)

    println("Может ли корабль отправиться в плавание? $canSail")
}
