package lesson_13

class SafePhoneAdress(
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
    val contacts = mutableListOf<SafePhoneAdress>()

    println("Введите имя:")
    val name = readln()

    println("Введите номер телефона:")
    val phoneInput = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println(e.javaClass.simpleName)
        null
    }

    println("Введите компанию:")
    val companyInput = readln().ifBlank { null }

    val contact = SafePhoneAdress(name, phoneInput, companyInput)
    contacts.add(contact)

    contacts.forEach { it.printContactInfo() }
}
