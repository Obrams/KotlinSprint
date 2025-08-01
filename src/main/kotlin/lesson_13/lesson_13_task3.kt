package lesson_13

class Contacts(
    val name: String,
    val phone: Long,
    val company: String? = null
) {
    fun printContactInfo() {
        println(
            "Имя: $name\n" +
                    "Номер: $phone\n" +
                    "Компания: ${company ?: "не указано"}\n"
        )
    }
}

fun main() {
    val contacts = mutableListOf(
        Contacts(
            name = "Ростислав",
            phone = 89123456789
        ),
        Contacts(
            name = "Дмитрий",
            phone = 89123456789
        ),
        Contacts(
            name = "Вячеслав",
            phone = 89123456789,
            company = "ОЗОН"
        ),
        Contacts(
            name = "Артём",
            phone = 89123456789,
            company = "Яндекс"
        ),
        Contacts(
            name = "Гриша",
            phone = 89123456789,
            company = "null"
        )
    )

    contacts.forEach { c ->
        c.printContactInfo()
    }

    val companies = contacts
        .mapNotNull { it.company }
        .toSet()
    println(companies)
}
