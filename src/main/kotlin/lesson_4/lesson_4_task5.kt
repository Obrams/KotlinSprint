package lesson_4

fun main() {
    println("Есть ли повреждения? (true/false): ")
    val hasDamage = readln().toBoolean()
    println("Сколько членов экипажа?")
    val crewCount = readln().toInt()
    println("Сколько ящиков провизии?")
    val provisionsBoxes = readln().toInt()
    println("Погода благоприятна? (true/false):")
    val isWeatherFavorable = readln().toBoolean()

    val canSail =
        (!hasDamage && crewCount in 55..70 && provisionsBoxes > 50) ||
                (hasDamage && crewCount == 70 && isWeatherFavorable && provisionsBoxes >= 50)

    println("Может ли корабль отправиться в плавание? $canSail")
}
