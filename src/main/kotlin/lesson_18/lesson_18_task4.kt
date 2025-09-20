package lesson_18


open class Box(
    open var length: Int = 0,
    open val width: Int = 0,
    open val height: Int = 0
) {
    open fun getSurfaceArea(): Int {
        return 0
    }
}

class Cube(val lengthCube: Int) : Box() {
    override fun getSurfaceArea(): Int {
        return 6 * (lengthCube * lengthCube)
    }
}

class Rectangle(
    val lengthRectangle: Int,
    val widthRectangle: Int,
    val heightRectangle: Int,
) : Box() {
    override fun getSurfaceArea(): Int {
        return 2 * ((lengthRectangle * widthRectangle) +
                (lengthRectangle * heightRectangle) +
                (widthRectangle * heightRectangle))
    }

}

fun main() {
    val boxes: List<Box> = listOf(Cube(4), Rectangle(2, 3, 4))
    for (box in boxes) {
        println(box.getSurfaceArea())
    }
}