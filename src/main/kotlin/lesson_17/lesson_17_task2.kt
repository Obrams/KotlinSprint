package lesson_17

class Ship(
    initialName: String,
    val averageSpeed: Double,
    val homePort: String,
) {
    var name = initialName
        set(value) {
            println("Предупреждение: имя корабля нельзя изменять!")
        }
}

fun main() {
    val ship = Ship("ShipName", 10.1, "PortName")
    println("Корабль: ${ship.name}")

    ship.name = "NewName"
    println(ship.name)

}