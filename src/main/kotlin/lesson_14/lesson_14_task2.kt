package lesson_14

open class Liner2(
    open val name: String,
    open val speed: Int = 500,
    open val loadCapacity: Int = 700,
    open val capacity: Int = 1500,
) {
    open fun load() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    fun displayInfo() {
        println("Название: $name")
        println("Скорость: $speed")
        println("Вместительность: $capacity")
        println("Грузоподъёмность: $loadCapacity")
        println()
    }
}

class Cargo2(
    override val name: String
) : Liner2(
    name = name,
    speed = 15,
    loadCapacity = 500,
    capacity = 2000
) {
    override fun load() {
        println("$name активирует погрузочный кран")
    }
}

class Icebreaker2(
    override val name: String
) : Liner2(
    name = name,
    speed = 10,
    loadCapacity = 300,
    capacity = 300
){
    fun chopIce() {
        println("$name колет лёд")
    }

    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }
}



fun main() {
    val cargo1 = Cargo2("cargo1")
    cargo1.load()
    cargo1.displayInfo()

    val icebreaker1 = Icebreaker2("icebreaker1")
    icebreaker1.load()
    icebreaker1.chopIce()
    icebreaker1.displayInfo()

    val liner1 = Liner2("liner1")
    liner1.load()
    liner1.displayInfo()

}
