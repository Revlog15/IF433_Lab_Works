package oop_126621_RevandAnrianPutra.week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,

    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}