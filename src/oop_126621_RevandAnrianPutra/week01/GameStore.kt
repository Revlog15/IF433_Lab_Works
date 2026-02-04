package oop_126621_RevandAnrianPutra.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000
    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game: $title")
    println("Harga Akhir: Rp$finalPrice")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 80 / 100 else price * 90 / 100
