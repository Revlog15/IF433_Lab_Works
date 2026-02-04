package oop_126621_RevandAnrianPutra.week01
fun main() {
    val name = "john Thor"
    val score = 80


    println("Nama:  $name  , Nilai: $score")
// Tambahkan di bawah println sebelumnya
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

}