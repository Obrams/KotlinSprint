package lesson_13

class PhoneAdress(
    val name: String,
    val phone: Long?,
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
    val contacts = mutableListOf<PhoneAdress>()


    do {
        println("Введите имя:")
        val name = readln()

        println("Введите номер телефона:")
        val phoneInput = readln().toLongOrNull()

        if (phoneInput == null) {
            println("Номер телефона не введён или введён неверно")
        } else {
            println("Введите компанию:")
            val companyInput = readln().ifBlank { null }

            val contact = PhoneAdress(name, phoneInput, companyInput)
            contacts.add(contact)
        }
        println("Добавить ещё контакт? (да/нет)")
        val answer = readln()
    } while (answer.lowercase() == "да")

    contacts.forEach { it.printContactInfo() }

    val companies = contacts
        .mapNotNull { it.company }
        .toSet()

    println(companies)
}
