package lesson_5

const val LENGTH = 100
const val UNDERWEIGHT = 18.5
const val NORMAL_WEIGHT = 25
const val OVERWEIGHT = 30

fun main() {
    println("Введите вес в кг:")
    val userWeight = readln().toDouble()

    println("Введите рост в сантиметрах:")
    val userHeight = readln().toDouble() / LENGTH
    //val heightMeters = userHeight / LENGTH
    val bodyMassIndex = userWeight / (userHeight * userHeight)

    val category = when {
        bodyMassIndex < UNDERWEIGHT -> "Недостаточная масса тела"
        bodyMassIndex < NORMAL_WEIGHT -> "Нормальная масса тела"
        bodyMassIndex < OVERWEIGHT -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    val formattedBmi = String.format("%.2f", bodyMassIndex)

    println("Ваш ИМТ равен $formattedBmi и относится к категории: $category")

}
