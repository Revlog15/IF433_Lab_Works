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
}
