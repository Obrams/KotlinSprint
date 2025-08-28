package lesson_15

interface Flyable {
    fun flying()
}

interface Swimmable {
    fun swimming()
}

class Karas() : Swimmable {
    override fun swimming() {
        println("Карась плывет медленно")
    }

}

class Chaika() : Flyable {
    override fun flying() {
        println("Чайка летит высоко")
    }
}

class Utka() : Flyable, Swimmable {
    override fun swimming() {
        println("Утка плывет по воде")
    }

    override fun flying() {
        println("Утка летит в небе")
    }
}

fun main() {
    val karas = Karas()
    karas.swimming()

    val chaika = Chaika()
    chaika.flying()

    val utka = Utka()
    utka.flying()
    utka.swimming()
}