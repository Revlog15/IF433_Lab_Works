package oop_126621_RevandAnrianPutra.week14

import java.io.File

class BadOrderProcessor {

    // VIOLATION: Hardcoded file I/O, diskon, dan notifikasi dalam satu class
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        // VIOLATION SRP/DIP: Notifikasi langsung hardcoded
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

fun main() {
    val processor = BadOrderProcessor()

    processor.processOrder(
        itemName = "Keyboard Mechanical",
        basePrice = 500_000.0,
        customerType = "VIP"
    )
}