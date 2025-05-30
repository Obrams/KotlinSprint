package lesson_4
    const val MIN_WEIGHT = 35
    const val MAX_WEIGHT = 100
    const val MAX_VOLUME = 100

fun main() {
    val minWeight = MIN_WEIGHT
    val maxWeight = MAX_WEIGHT
    val maxVolume = MAX_VOLUME

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории: " +
            "${weight1 > minWeight && weight1 <= maxWeight && volume1 < maxVolume}")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории: " +
            "${weight2 > minWeight && weight2 <= maxWeight && volume2 < maxVolume}")
}
