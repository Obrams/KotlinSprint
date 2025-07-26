package lesson_12

class Temperature() {
    var dayTemperature = 0
    var nightTemperature = 0
    var precipitationDuringDay: Boolean = false

    fun printTemperature() {
        println("Днём: $dayTemperature, ночью: $nightTemperature, осадки: $precipitationDuringDay")
    }
}

fun main() {
    val day1 = Temperature()
    val day2 = Temperature()

    day1.dayTemperature = 20
    day1.nightTemperature = 10
    day1.precipitationDuringDay = true

    day2.dayTemperature = 25
    day2.nightTemperature = 15
    day2.precipitationDuringDay = false

    day1.printTemperature()
    day2.printTemperature()
}