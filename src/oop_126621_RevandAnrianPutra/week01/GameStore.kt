package oop_126621_RevandAnrianPutra.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 600000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 80 / 100 else price * 90 / 100
