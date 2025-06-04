package lesson_5

const val KM_FOR_FUEL_CALCULATION = 100
fun main() {
    println("Введите расстояние поездки:")
    val tripDistanceKm = readln().toDouble()
    println("Введите расход топлива на 100 км:")
    val fuelConsumptionPerKm = readln().toDouble()
    println("Введите цену литра топлива:")
    val currentFuelPricePerLiter = readln().toDouble()

    val litersNeeded = (tripDistanceKm * fuelConsumptionPerKm) / KM_FOR_FUEL_CALCULATION
    val totalCost = litersNeeded * currentFuelPricePerLiter

    val formattedTotalCost = String.format("%.2f", totalCost)

    println(
        """
        Необходимое количество топлива: $litersNeeded литров.
        Итоговая стоимость поездки составит: $formattedTotalCost рублей.
        """.trimIndent()
    )

}
