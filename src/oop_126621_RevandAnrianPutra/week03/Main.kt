package oop_126621_RevandAnrianPutra.week03

fun main() {

    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000
    println("Gaji: ${e.salary}")
    println("Net salary: ${e.netSalary}")

    val w = Weapon("Pedang", 100)

    w.damage = 9999


    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")

    e.increasePerformance()
    e.printStatus()
}