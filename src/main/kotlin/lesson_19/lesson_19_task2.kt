package lesson_19


enum class CategoryType(val nameCategory: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    SUNDRY("Разное");

    fun getDisplayName(): String {
        return nameCategory
    }
}

class Product(
    val name: String,
    val productId: Int,
    val categoryType: CategoryType,
) {
    fun printInfo() {
        println(
            "Название: $name\n" +
                    "Id: $productId\n" +
                    "Категория: ${categoryType.getDisplayName()}"
        )
    }
}

fun main() {
    val pen = Product("РУЧКА", 1, CategoryType.STATIONERY)
    pen.printInfo()

    val shirt = Product("Футболка", 2, CategoryType.CLOTHING)
    shirt.printInfo()
}