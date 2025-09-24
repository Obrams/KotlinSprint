package lesson_19

enum class Ammunition(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class TypeOfTank(
    private var currentAmmunition: Ammunition? = null

) {
    fun charge(ammunition: Ammunition) {
        currentAmmunition = ammunition
    }

    fun shoot() {
        if (currentAmmunition == null) {
            println("Танк не заряжен")
        } else {
            println("Выстрел патроном $currentAmmunition — урон: ${currentAmmunition!!.damage}")
        }
    }
}

fun main() {
    val tank = TypeOfTank()
    tank.shoot()
    tank.charge(Ammunition.BLUE)
    tank.shoot()
    tank.charge(Ammunition.RED)
    tank.shoot()
}