package oop_126621_RevandAnrianPutra.week04

fun main() {
    val v = Vehicle("Generic")
    v.accelerate()
    v.honk()

    val c = Car("Toyota", 4)
    c.accelerate()
    c.honk()
    c.openTrunk()

    val e = ElectricCar("Tesla", 4, 80)
    e.accelerate()
    e.honk()
    e.openTrunk()
}