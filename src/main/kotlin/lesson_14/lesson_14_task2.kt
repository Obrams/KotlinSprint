package lesson_14


class Cargo2(
    name: String,
    speed: Int = 400,
    loadCapacity: Int = 2000,
    capacity: Int = 500,
) : Liner2(name, speed, loadCapacity, capacity) {
    override fun load() {
        println("$name активирует погрузочный кран")
    }
}

class Icebreaker2(
    name: String,
    speed: Int = 300,
    loadCapacity: Int = 500,
    capacity: Int = 400,

    ) : Liner2(name, speed, loadCapacity, capacity) {
    fun chopIce() {
        println("$name колет лёд")
    }

    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }
}

open class Liner2(
    val name: String,
    val speed: Int = 500,
    val loadCapacity: Int = 700,
    val capacity: Int = 1500,
) {
    open fun load() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    fun info() {
        println("Название: $name")
        println("Скорость: $speed")
        println("Вместительность: $capacity")
        println("Грузоподъёмность: $loadCapacity")
        println()
    }
}

fun main() {
    val cargo1 = Cargo2("cargo1")
    cargo1.load()
    cargo1.info()

    val icebreaker1 = Icebreaker2("icebreaker1")
    icebreaker1.load()
    icebreaker1.chopIce()
    icebreaker1.info()

    val liner1 = Liner2("liner1")
    liner1.load()
    liner1.info()

}
