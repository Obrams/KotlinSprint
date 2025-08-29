package lesson_15

const val MAX_PASSENGERS_CAR = 3
const val MAX_PASSENGERS_TRUCK = 1
const val MAX_WEIGHT = 2

interface Movable {
    fun drive()
}

interface PassengerCarrier {
    fun loadPassenger(count: Int) {
        val target = (currentPassengers + count).coerceIn(0, maxPassengers)
        currentPassengers = target

    }

    fun unloadPassenger(count: Int) {
        val target = (currentPassengers - count).coerceIn(0, maxPassengers)
        currentPassengers = target
    }

    var maxPassengers: Int
    var currentPassengers: Int
}

interface CargoCarrier {
    fun loadCargo(amount: Int) {
        val target = (currentCargo + amount).coerceIn(0, maxCargo)
        currentCargo = target
    }

    fun unloadCargo(amount: Int) {
        val target = (currentCargo - amount).coerceIn(0, maxCargo)
        currentCargo = target
    }

    var maxCargo: Int
    var currentCargo: Int
}

class Car : Movable, PassengerCarrier {
    override var maxPassengers = MAX_PASSENGERS_CAR
    override var currentPassengers = 0

    override fun drive() {
        println("Едем")
    }
}

class Truck : Movable, PassengerCarrier, CargoCarrier {
    override var maxPassengers = MAX_PASSENGERS_TRUCK
    override var currentPassengers = 0
    override var maxCargo = MAX_WEIGHT
    override var currentCargo = 0

    override fun drive() {
        println("Едем")
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