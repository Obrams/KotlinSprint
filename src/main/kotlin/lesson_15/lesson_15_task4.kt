package lesson_15

open class Product(
    open val productName: String,
    open val countStock: Int,
)

class Instrument(
    productName: String,
    countStock: Int,
) : Product(productName, countStock) {

}

class Accessory(
    productName: String,
    countStock: Int,
) : Product(productName, countStock) {

}

interface AccessorySearch {
    fun searchFor(instrument: Instrument) {
        println("Выполняется поиск")
    }
}

fun main() {
    val guitar = Instrument("Гитара", 1)

}