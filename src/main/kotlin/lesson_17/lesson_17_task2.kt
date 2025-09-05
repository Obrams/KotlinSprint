package lesson_17

/*
Опиши класс для корабля в мобильной игре. Поля хранят имя, среднюю скорость и порт приписки.

Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.

Создай экземпляр класса и протестируй работу.
 */

class Ship(
    initialName: String,
    val averageSpeed: Double,
    val homePort: String,
) {
    var name = initialName
        set(value) {
            println("Предупреждение: имя корабля нельзя изменять!")
            field = field
        }
}

fun main() {
    val ship = Ship("ShipName", 10.1, "PortName")
    println("Корабль: ${ship.name}")

    ship.name = "NewName"
    println(ship.name)

}