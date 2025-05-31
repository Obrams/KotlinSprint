package lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println("Введите данные для авторизации в систему:")
    val inputUserName = readln()
    val inputUserPassword = readln()

    if (inputUserName == USER_NAME && inputUserPassword == USER_PASSWORD) {
        println("Добро пожаловать в систему!")
    } else {
        println(
            "Введенные данные не совпадают, попробуйте ввести занового " +
                    "или зарегистрируйтесь"
        )
    }

}
