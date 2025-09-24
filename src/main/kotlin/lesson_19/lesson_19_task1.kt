package lesson_19


enum class FishType(val label: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHT_FISH("Петушок"),


}

fun main() {
    for (fish in FishType.entries) {
        println(fish.label)
    }
}