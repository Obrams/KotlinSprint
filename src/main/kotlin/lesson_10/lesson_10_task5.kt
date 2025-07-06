package lesson_10

const val LOGIN = "Obrams"
const val PASSWORD = "SecretPassword"

fun main() {
    startShoppingSession()
}

fun startShoppingSession() {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    val token = autorizations(login, password)

    if (token != null) {
        val cart = getCartContents(token)
        println("Ваша корзина: $cart")
    } else {
        println("Неудачная авторизация")
    }
}

fun autorizations(login: String, password: String): String? {
    return when {
        login == LOGIN && password == PASSWORD -> generateToken()
        else -> null
    }

}

fun generateToken(): String {
    val allSymbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    var token = ""
    for (i in 0 until 32) {
        token += allSymbols.random()
    }
    return token
}

fun getCartContents(token: String?): List<String>? {
    val basket = listOf("Яблоко", "Хлеб", "Молоко")

    return if (token != null) {
        basket
    } else {
        null
    }
}