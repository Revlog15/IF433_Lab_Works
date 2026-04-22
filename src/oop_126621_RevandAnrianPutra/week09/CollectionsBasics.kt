package oop_126621_RevandAnrianPutra.week09

fun main() {
    println("=== TEST LIST ===")
    // Immutable List: Tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++") [cite: 17]
    // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR! [cite: 18]
    println("Immutable List: $frameworks") [cite: 19]

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90) [cite: 21]
    scores.add(95) [cite: 22]
    scores[0] = 88 [cite: 23]
    println("Mutable List: $scores") [cite: 24]

    println("\n=== TEST SET ===") [cite: 30]
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4) [cite: 31]
    println("Unique Numbers (Set): $uniqueNumbers") [cite: 32]

    val activeUsers = mutableSetOf("UserA", "UserB") [cite: 33]
    activeUsers.add("UserC") [cite: 34]
    activeUsers.add("UserA") // Diabaikan karena sudah ada [cite: 35]
    println("Active Users: $activeUsers")

}