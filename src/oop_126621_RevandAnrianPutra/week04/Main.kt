package oop_126621_RevandAnrianPutra.week04

fun main() {
    val v = Vehicle("Generic")
    v.accelerate()
    v.honk()

    val c = Car("Toyota", 4)
    c.accelerate()
    c.honk()
    c.openTrunk()
}