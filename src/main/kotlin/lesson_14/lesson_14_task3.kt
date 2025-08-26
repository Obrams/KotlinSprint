package lesson_14

import kotlin.math.PI

const val BLACK = "black"
const val WHITE = "white"

abstract class Figure(
    val color: String,
) {
    abstract fun calcArea(): Double

    abstract fun calcPerimeter(): Double

}

class Circle(
    color: String,
    val radius: Int
) : Figure(color) {
    override fun calcPerimeter(): Double {
        return 2 * PI * radius
    }

    override fun calcArea(): Double {
        return PI * (radius * radius)
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int
) : Figure(color) {
    override fun calcPerimeter(): Double {
        return 2 * (width.toDouble() + height)
    }

    override fun calcArea(): Double {
        return width.toDouble() * height
    }
}

fun main() {
    val figures: List<Figure> = listOf(
        Circle(BLACK, 15),
        Circle(WHITE, 5),
        Rectangle(WHITE, 10, 20),
        Rectangle(BLACK, 4, 2)
    )
    val sumPerimeter = figures.filter { it.color == BLACK }.sumOf { it.calcPerimeter() }
    val sumArea = figures.filter { it.color == WHITE }.sumOf { it.calcArea() }

    println("Сумма периметров черных $sumPerimeter")
    println("Сумма площадей белых $sumArea")
}
