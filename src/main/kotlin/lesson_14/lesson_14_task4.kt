package lesson_14

/*
В компьютерной игре существуют планеты. У некоторых из них есть спутники.

Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.

Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.

- планета должна хранить список спутников.

Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.
 */

open class CelestialBodies(
    val name: String,
    val presenceAtmosphere: Boolean,
    val suitabilityLanding: Boolean
) {

}

open class Planets(
    name: String,
    presenceAtmosphere: Boolean,
    suitabilityLanding: Boolean,
    val satellites: MutableList<Satellites> = mutableListOf()
) : CelestialBodies(name, presenceAtmosphere, suitabilityLanding) {
    fun addSatellitesInPlanet(nameSatellites: Satellites) {
        satellites.add(nameSatellites)
    }
}

class Satellites(
    name: String,
    presenceAtmosphere: Boolean,
    suitabilityLanding: Boolean,
) : CelestialBodies(name, presenceAtmosphere, suitabilityLanding) {

}

fun main() {
    val moon1 = Satellites("Луна-1", true, true)
    val moon2 = Satellites("Луна-2", false, false)

    val planet = Planets("Венера", false, true)

    planet.addSatellitesInPlanet(moon1)
    planet.addSatellitesInPlanet(moon2)

    println(planet.name)
    for (satellite in planet.satellites) {
        println(satellite.name)
    }
}
