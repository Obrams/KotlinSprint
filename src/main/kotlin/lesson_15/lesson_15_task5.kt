package lesson_15

const val MAX_PASSENGERS_CAR = 3
const val MAX_PASSENGERS_TRUCK = 1
const val MAX_WEIGHT = 2

interface Movable {
    fun drive()
}

interface PassengerCarrier {
    var maxPassengers: Int
    var currentPassengers: Int

    fun loadPassenger(count: Int) {
        val target = (currentPassengers + count).coerceAtMost(maxPassengers)
        currentPassengers = target

    }

    fun unloadPassenger(count: Int) {
        val target = (currentPassengers - count).coerceAtLeast(0)
        currentPassengers = target
    }
}

interface CargoCarrier {
    var maxCargo: Int
    var currentCargo: Int

    fun loadCargo(amount: Int) {
        val target = (currentCargo + amount).coerceAtMost(maxCargo)
        currentCargo = target
    }

    fun unloadCargo(amount: Int) {
        val target = (currentCargo - amount).coerceAtLeast(0)
        currentCargo = target
    }
}

class Car : Movable, PassengerCarrier {
    override var maxPassengers = MAX_PASSENGERS_CAR
    override var currentPassengers = 0

    override fun drive() {
        println("Едем в легковой машине")
    }
}

class Truck : Movable, PassengerCarrier, CargoCarrier {
    override var maxPassengers = MAX_PASSENGERS_TRUCK
    override var currentPassengers = 0
    override var maxCargo = MAX_WEIGHT
    override var currentCargo = 0

    override fun drive() {
        println("Едем в грузовой машине")
    }
}

fun main() {
    val car1 = Car()
    val car2 = Car()
    val truck = Truck()

    car1.loadPassenger(3)
    car1.drive()
    car2.loadPassenger(3)
    car2.drive()
    truck.loadCargo(2)
    truck.drive()

}