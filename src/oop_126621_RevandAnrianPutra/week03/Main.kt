package oop_126621_RevandAnrianPutra.week03

fun main() {

    val e = Employee("Budi")

    e.salary = 5000
    println("Gaji: ${e.salary}")
    println("Net salary: ${e.netSalary}")

    val w = Weapon("Pedang", 100)

    w.damage = 9999


    println("Damage: ${w.damage}")
    println("Tier: ${w.tier}")


    val p = Player("Revand")

    p.addXp(50)
    p.addXp(60)


    e.increasePerformance()
    e.printStatus()
}