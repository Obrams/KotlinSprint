package lesson_4

fun main() {
    val isSunny= true
    val tentOpen = true
    val humidity= 20
    val season= "winter"

    val conditionsMet = isSunny && tentOpen && (humidity == 20) && (season != "winter")
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsMet")
}
