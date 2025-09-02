package lesson_16


class Profile() {
    private val login = "biguser229"
    private val password = "superpassword"

    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }

}

fun main() {
    val inputPassword = Profile()
    println("${inputPassword.validatePassword("superpassword")}")

}