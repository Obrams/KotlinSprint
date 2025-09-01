package lesson_16

private const val PI = 3.14

class Circle1(private val radius: Int) {

    fun area(): Double {
        return 2 * (PI * radius)
    }

    fun circumference(): Double {
        return PI * (radius * radius)
    }

}

fun main() {
    val circle = Circle1(5)
    println("Площадь круга: ${circle.circumference()}")
    println("Длинна окружности: ${circle.area()}")

}