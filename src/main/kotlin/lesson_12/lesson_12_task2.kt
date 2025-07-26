package lesson_12

class NewTemperature(var dayTemperature: Int, var nightTemperature: Int, var precipitationDuringDay: Boolean) {

    fun printTemperature() {
        println("Днём: $dayTemperature, ночью: $nightTemperature, осадки: $precipitationDuringDay")
    }
}

fun main() {
    val day1 = NewTemperature(
        dayTemperature = 30,
        nightTemperature = 11,
        precipitationDuringDay = false
    )
    day1.printTemperature()
}