package oop_126621_RevandAnrianPutra.week03

fun main() {

    val e = Employee("Budi")

    e.salary = 5000
    println("Gaji: ${e.salary}")
    println("Net salary: ${e.netSalary}")

    e.increasePerformance()
    e.printStatus()
}