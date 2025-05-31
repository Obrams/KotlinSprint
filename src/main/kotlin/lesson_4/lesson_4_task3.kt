package lesson_4

const val IS_SUNNY = true
const val TENT_OPEN = true
const val HUMIDITY = 20
const val UNFAVORABLE_SEASON = "winter"

fun main() {
    val isSunnyToday = true
    val tentOpenToday = true
    val humidityToday = 20
    val seasonToday = "winter"
    val conditionsMet = IS_SUNNY == isSunnyToday
            && TENT_OPEN == tentOpenToday
            && humidityToday == HUMIDITY
            && seasonToday != UNFAVORABLE_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsMet")
}
