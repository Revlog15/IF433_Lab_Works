package oop_126621_RevandAnrianPutra.week14

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "member" -> price * 0.85
            "employee" -> price * 0.70
            else -> price
        }
    }
}

fun main() {
    val calculator = DiscountCalculator()

    println(calculator.calculate(100_000.0, "student"))
    println(calculator.calculate(100_000.0, "member"))
    println(calculator.calculate(100_000.0, "employee"))
}