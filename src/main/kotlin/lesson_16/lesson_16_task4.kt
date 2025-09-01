package lesson_16

enum class OrderStatus {
    DRAFT, PROCESSING, SHIPPED, DELIVERED, CANCELED
}

class Order() {
    private val orderId = 1
    private var _status: OrderStatus = OrderStatus.DRAFT
    val status: OrderStatus get() = _status

    private fun changeStatusInternal(newStatus: OrderStatus) {
        _status = newStatus
    }

    fun requestStatusChange(newStatus: OrderStatus) {
        println("Выполняется проверка ожидайте")
        changeStatusInternal(newStatus)
    }
}

fun main() {
    val order = Order()
    println("Создали заказ")

    order.status
    println("Проверили статус заказа и он равен ${order.status}")

    order.requestStatusChange(OrderStatus.PROCESSING)
    println("Статус изменен на ${OrderStatus.PROCESSING}")

    order.requestStatusChange(OrderStatus.SHIPPED)
    println("Статус изменен на ${OrderStatus.SHIPPED}")
}