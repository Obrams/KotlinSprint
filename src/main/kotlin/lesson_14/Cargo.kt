package lesson_14

class Cargo(
    name: String,
    speed: Int = 400,
    loadCapacity: Int = 2000,
    capacity: Int = 500,
    ) : Liner(name, speed, loadCapacity, capacity) {
}