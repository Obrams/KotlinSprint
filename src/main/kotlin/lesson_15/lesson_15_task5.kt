package lesson_15

const val MAXPASSENGERSCAR = 3
const val MAXPASSENGERSTRUCK = 1
const val MAXWEIGHT = 2

interface Movable {
    fun drive()
}

interface PassengerCarrier {
    fun loadPassenger(count: Int)
    fun unloadPassenger(count: Int)
    val maxPassengers: Int
    var currentPassengers: Int
}

interface CargoCarrier {
    fun loadCargo(amount: Int)
    fun unloadCargo(amount: Int)
    val maxCargo: Int
    val currentCargo: Int
}

class Car() : Movable, PassengerCarrier {
    override val maxPassengers = MAXPASSENGERSCAR
    override var currentPassengers = 0

    override fun drive() {
        println("Едем")
    }

    override fun loadPassenger(count: Int) {
        when {
            count <= 0 -> return
            currentPassengers + count <= maxPassengers -> currentPassengers += count
            else -> currentPassengers = maxPassengers
        }
    }

    override fun unloadPassenger(count: Int) {
        when {
            count <= 0 -> return
            currentPassengers - count >= 0 -> currentPassengers -= count
            else -> currentPassengers = 0
        }
    }
}

class Truck() : Movable, PassengerCarrier, CargoCarrier {
    override var maxCargo = MAXWEIGHT
    override var currentCargo = 0
    override val maxPassengersTruck = MAXPASSENGERSTRUCK
    override var currentPassengers = 0
    override fun drive() {
        println("Едем")
    }

    override fun loadCargo(amount: Int) {
        when {
            amount <= 0 -> return
            currentCargo + amount <= maxCargo -> currentCargo += amount
            else -> currentCargo = maxCargo
        }
    }
}



    override fun unloadCargo(amount: Int) {

    }

}