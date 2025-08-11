package lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String,
) {
    abstract fun calcArea(): Double

    abstract fun calcPerimeter(): Double

}

class Circle(
    color: String,
    val radius: Int
) : Figure(
    color
) {
    override fun calcPerimeter(): Double {
        return 2 * PI * radius.toDouble()
    }

    override fun calcArea(): Double {
        return PI * (radius * radius.toDouble())
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int
) : Figure(color) {
    override fun calcPerimeter(): Double {
        return 2 * (width.toDouble() + height.toDouble())
    }

    override fun calcArea(): Double {
        return width.toDouble() * height.toDouble()
    }
}

fun main() {
    val figures: List<Figure> = listOf(
        Circle("black", 15),
        Circle("white", 5),
        Rectangle("white", 10, 20),
        Rectangle("black", 4, 2)
    )
    val sumPerimeter = figures.filter { it.color == "black" }.sumOf { it.calcPerimeter() }
    val sumArea = figures.filter { it.color == "white" }.sumOf { it.calcArea() }

    println("Сумма периметров черных $sumPerimeter")
    println("Сумма площадей белых $sumArea")
}
