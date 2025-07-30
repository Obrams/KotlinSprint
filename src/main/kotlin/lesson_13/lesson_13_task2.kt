package lesson_13

class PhoneBook(
    val name: String,
    val phone: Long,
    val company: String? = null
) {
    init {
        println(
            "Имя: $name\n" +
                    "Номер: $phone\n" +
                    "Компания: ${company ?: "не указано"}\n"
        )
    }
}

fun main() {
    PhoneBook(
        name = "Ростислав",
        phone = 89123456789
    )
    PhoneBook(
        name = "Вячеслав",
        phone = 89123456789,
        company = "ОЗОН"
    )
}
