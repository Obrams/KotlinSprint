package lesson_12

const val CELSIUS = 273

class TemperatureV3(_dayTemperature: Int, _nightTemperature: Int, _precipitationDuringDay: Boolean) {
    var dayTemperature = _dayTemperature - CELSIUS
    var nightTemperature = _nightTemperature - CELSIUS
    var precipitationDuringDay = _precipitationDuringDay
    fun printTemperature() {
        println("Днём: $dayTemperature, ночью: $nightTemperature, осадки: $precipitationDuringDay")
    }
}

fun main() {
    val day1 = TemperatureV3(
        _dayTemperature = 303,
        _nightTemperature = 283,
        _precipitationDuringDay = true
    )
    day1.printTemperature()
}