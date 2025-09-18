package lesson_18


open class Animal(
    val name: String
) {
    open fun eat() {}
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}


class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val animal: List<Animal> = listOf(Fox("Мурка"), Dog("Шурик"), Cat("Белка"))
    animal.forEach { it.eat() }
}