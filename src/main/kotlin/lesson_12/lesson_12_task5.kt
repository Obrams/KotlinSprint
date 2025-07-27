package lesson_12

import kotlin.math.roundToInt
import kotlin.random.Random


class TemperatureFinal(_dayTemperature: Int, _nightTemperature: Int, _precipitationDuringDay: Boolean) {
    var dayTemperature = _dayTemperature - CELSIUSS
    var nightTemperature = _nightTemperature - CELSIUSS
    var precipitationDuringDay = _precipitationDuringDay

    init {
        println("Днём: $dayTemperature, ночью: $nightTemperature, осадки: $precipitationDuringDay")
    }
}

fun main() {

    val weatherList = mutableListOf<TemperatureFinal>()

    for (i in 1..30) {
        val weatherDay = TemperatureFinal(
            _dayTemperature = Random.nextInt(273, 303),
            _nightTemperature = Random.nextInt(258, 283),
            _precipitationDuringDay = Random.nextBoolean()
        )
        weatherList.add(weatherDay)
    }

    val dayTemps = weatherList.map { it.dayTemperature }
    val nightTemps = weatherList.map { it.nightTemperature }
    val countDaysPrecipitation = weatherList.count { it.precipitationDuringDay }

    val averageDayTemps = dayTemps.average().roundToInt()
    val averageNightTemps = nightTemps.average().roundToInt()

    println(
        "Количество дней с осадками: $countDaysPrecipitation \n" +
                "Средняя температура днем: $averageDayTemps \n" +
                "Средняя температура ночью: $averageNightTemps"
    )


}