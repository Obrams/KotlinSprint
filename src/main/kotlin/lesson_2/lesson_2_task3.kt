package lesson_2

const val MINUTE_FIX = 60
const val HOURS_FIX = 60

fun main () {
    val hours = 9
    val minute = 39
    val travelTimeMinutes = 457

    var totalMinutes = (hours * MINUTE_FIX) + minute + travelTimeMinutes
    val arrivalHour = (totalMinutes / MINUTE_FIX) % HOURS_FIX
    val arrivalMinute = totalMinutes % MINUTE_FIX

    println("Прибытие в $arrivalHour:$arrivalMinute")
}
