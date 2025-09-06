package lesson_17

var totalMoves: Int = 0
    private set

class Package(
    initialLocation: String,
    val parcelNumber: Long
) {
    var currentLocation = initialLocation
        set(value) {
            if (value != field) {
                field = value
                totalMoves++  // инкрементим глобальный счетчик
            }
        }
}

fun main() {
    val package1 = Package("Курск", 32423432432)
    val package2 = Package("Москва", 77777777777)

    package1.currentLocation = "Москва"
    package1.currentLocation = "Ростов"
    package2.currentLocation = "Сочи"
    package2.currentLocation = "Калуга"

    println("Общее количество перемещений: $totalMoves")
}
