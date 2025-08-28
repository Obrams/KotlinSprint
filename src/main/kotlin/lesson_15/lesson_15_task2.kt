package lesson_15

import java.sql.Timestamp

abstract class WeatherStationStats {
    abstract val stationId: Int
    abstract val timestamp: Timestamp
    abstract fun toMessage(): String
}

class Temperature(
    override val stationId: Int,
    override val timestamp: Timestamp,
    val valueCelsius: Int,
) : WeatherStationStats() {
    override fun toMessage(): String {
        return ("Cтанция с номером $stationId в $timestamp передала " +
                "температуру в $valueCelsius Цельсия")
    }
}

class PrecipitationAmount(
    override val stationId: Int,
    override val timestamp: Timestamp,
    val valueMm: Long
) : WeatherStationStats() {
    override fun toMessage(): String {
        return ("Cтанция с номером $stationId в $timestamp передало следующие " +
                "количество осадков $valueMm миллиметров осадков")
    }
}

class WeatherServer {
    fun send(stats: WeatherStationStats) {
        println(stats.toMessage())
    }
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