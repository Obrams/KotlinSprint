package lesson_15

import java.sql.Timestamp

/*
Необходимо разработать простую систему мониторинга погодных условий,
которая будет собирать данные о температуре и количестве осадков.

Создай абстрактный класс WeatherStationStats.
Он будет служить родителем для классов-объектов погодных данных: Temperature и PrecipitationAmount.

Реализуй логику имитации отправки сообщения на сервер в классе WeatherServer.
 Метод отправки сообщения должен принимать объект типа WeatherStationStats и, в зависимости от типа переданного объекта,
 выводить соответствующие данные.

Создай по одному объекту для разных типов погодных данных и протестируй работу программы.
 */

abstract class WeatherStationStats {
    abstract val stationId: Int
    abstract val timestamp: Timestamp
    abstract fun toMessage(): String

}

class Temperature(
    override val stationId: Int,
    override val timestamp: Timestamp,
    val valueCelsius: Int,
    ): WeatherStationStats(){
    override fun toMessage(): String {
        return ("Cтанция с номером $stationId в $timestamp передала " +
                "температуру в $valueCelsius Цельсия")
    }
}

class PrecipitationAmount(
    override val stationId: Int,
    override val timestamp: Timestamp,
    val valueMm: Long
) : WeatherStationStats(){
    override fun toMessage(): String {
        return ("Cтанция с номером $stationId в $timestamp передало следующие " +
                "количество осадков $valueMm миллиметров осадков")
    }
}

class WeatherServer {
    fun send(stats: WeatherStationStats) { println(stats.toMessage()) }
}

fun main() {
    val temperature = Temperature(
        stationId = 101,
        timestamp = Timestamp(System.currentTimeMillis()),
        valueCelsius = 23
    )

    val precipitation = PrecipitationAmount(
        stationId = 101,
        timestamp = Timestamp(System.currentTimeMillis() + 5_000),
        valueMm = 12
    )

    val server = WeatherServer()

    server.send(temperature)
    server.send(precipitation)

}