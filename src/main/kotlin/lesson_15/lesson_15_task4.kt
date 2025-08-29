package lesson_15

open class Product(
    val productName: String,
    val countStock: Int,
)

interface Searchable {
    fun searchForAccessories()
}

class Instrument(
    productName: String,
    countStock: Int,
) : Searchable, Product(productName, countStock) {
    override fun searchForAccessories() {
        println("Выполняется поиск аксессуаров для $productName")
    }
}

class Accessory(
    productName: String,
    countStock: Int,
) : Product(productName, countStock)

fun main() {
    val guitar = Instrument("Гитара", 1)
    guitar.searchForAccessories()
}