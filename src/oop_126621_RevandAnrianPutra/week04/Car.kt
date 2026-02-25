package oop_126621_RevandAnrianPutra.week04

class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
    override fun accelerate() {
        super.accelerate()
        println("$brand menambah kecepatan dengan mulus.")
    }
}