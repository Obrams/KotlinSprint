package lesson_2

fun main () {
    val hours = 9
    val minute = 39
    val travelTimeMinutes = 457

    var totalMinutes = (hours * 60) + minute + travelTimeMinutes
    val arrivalHour = (totalMinutes / 60) % 24
    val arrivalMinute = totalMinutes % 60

    println("Прибытие в $arrivalHour:$arrivalMinute")
}
