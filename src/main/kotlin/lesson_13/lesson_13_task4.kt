package lesson_13

class PhoneAdress(
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
    val contacts = mutableListOf<PhoneAdress>()

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

    contacts.add(
        PhoneAdress(name = "Дмитрий", phone = 89123456789)
    )
    contacts.add(
        PhoneAdress(name = "Вячеслав", phone = 89123456789, company = "ОЗОН")
    )
    contacts.add(
        PhoneAdress(name = "Артём", phone = 89123456789, company = "Яндекс")
    )
    contacts.add(
        PhoneAdress(name = "Гриша", phone = 89123456789, company = "null")
    )

    contacts.forEach { it.printContactInfo() }

    val companies = contacts
        .mapNotNull { it.company }
        .toSet()

    println(companies)
}
