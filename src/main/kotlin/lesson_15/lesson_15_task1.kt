package lesson_15

interface IFlyable{
    fun flying() {
        println("Лечу")
    }
}

interface ISwimmable{
    fun swimming() {
        println("Плыву")
    }
}

class Karas(): ISwimmable {
    override fun swimming() {
       println("Карась плывет медленно")
    }

}
class Chaika():IFlyable {
    override fun flying() {
        println("Чайка летит высоко")
    }
}
class Utka():IFlyable,ISwimmable {
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