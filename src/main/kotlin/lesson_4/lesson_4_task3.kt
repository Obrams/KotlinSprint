package lesson_4

const val IS_SUNNY = true
const val TENT_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {
    val conditionsMet = IS_SUNNY && TENT_OPEN && (HUMIDITY == 20) && (SEASON != "winter")
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsMet")
}
