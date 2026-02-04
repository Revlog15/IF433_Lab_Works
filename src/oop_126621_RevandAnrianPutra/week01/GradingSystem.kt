package oop_126621_RevandAnrianPutra.week01
fun main() {
    val name = "john Thor"
    val score: Int? = 85


    val grade = calculateGrade(score ?: 0)
    println("Nilai kamu: ${score ?: "Tidak ada nilai"}")
    println("Grade kamu: $grade")

}

    fun calculateGrade(score: Int): String =
        when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "D"
        }





