package oop_126621_RevandAnrianPutra.week01
fun main() {
    val name = "john Thor"
    val score = 80
    val grade = calculateGrade(score)
    println("Grade kamu: $grade")
    println("Nama:  $name  , Nilai: $score")
}
    fun calculateGrade(score: Int): String =
        when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "D"
        }





