package oop_126621_RevandAnrianPutra.week03



class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif")
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Performance meningkat! Rating sekarang: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
    val tax: Double
        get() = salary * 0.1

    val netSalary: Int
        get() = salary - tax.toInt()

}