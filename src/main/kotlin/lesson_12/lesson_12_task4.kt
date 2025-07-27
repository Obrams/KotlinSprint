package lesson_12

const val CELSIUSS = 273

class TemperatureV4(_dayTemperature: Int, _nightTemperature: Int, _precipitationDuringDay: Boolean) {
    var dayTemperature = _dayTemperature - CELSIUSS
    var nightTemperature = _nightTemperature - CELSIUSS
    var precipitationDuringDay = _precipitationDuringDay

    init {
        println("Днём: $dayTemperature, ночью: $nightTemperature, осадки: $precipitationDuringDay")
    }
}

fun main() {
    TemperatureV4(
        _dayTemperature = 303,
        _nightTemperature = 283,
        _precipitationDuringDay = true
    )

    TemperatureV4(
        _dayTemperature = 400,
        _nightTemperature = 300,
        _precipitationDuringDay = false
    )
}