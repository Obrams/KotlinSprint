package lesson_14

class Icebreaker(
    name: String,
    speed: Int = 300,
    loadCapacity: Int = 500,
    capacity: Int = 400,

    ) : Liner(name, speed, loadCapacity, capacity) {
    fun chopIce() {
        println("$name колит лёд")
    }
}