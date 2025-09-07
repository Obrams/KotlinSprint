package lesson_17


class Package(
    initialLocation: String,
    val parcelNumber: Long,
    private var totalMoves: Int = 0
) {

    var currentLocation = initialLocation
        set(value) {
            if (value != field) {
                field = value
                totalMoves++
            }
        }

    fun getMoveCount(): Int {
        return totalMoves
    }
}


fun main() {
    val package1 = Package("Курск", 32423432432)
    val package2 = Package("Москва", 77777777777)

    package1.currentLocation = "Москва"
    package1.currentLocation = "Ростов"
    package2.currentLocation = "Сочи"
    package2.currentLocation = "Калуга"

    println("Перемещений у посылки 1: ${package1.getMoveCount()}")
    println("Перемещений у посылки 2: ${package2.getMoveCount()}")
}
