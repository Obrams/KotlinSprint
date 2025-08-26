package lesson_14

open class CelestialBody(
    val name: String,
    val presenceAtmosphere: Boolean,
    val suitabilityLanding: Boolean
)

open class Planet(
    name: String,
    presenceAtmosphere: Boolean,
    suitabilityLanding: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : CelestialBody(name, presenceAtmosphere, suitabilityLanding) {
    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    fun printInfo() {
        println(name)
        satellites.forEach { println(it.name) }
    }
}

class Satellite(
    name: String,
    presenceAtmosphere: Boolean,
    suitabilityLanding: Boolean,
) : CelestialBody(name, presenceAtmosphere, suitabilityLanding)

fun main() {
    val moon1 = Satellite("Луна-1", true, true)
    val moon2 = Satellite("Луна-2", false, false)

    val planet = Planet("Венера", false, true)

    planet.addSatellite(moon1)
    planet.addSatellite(moon2)

    planet.printInfo()
}
