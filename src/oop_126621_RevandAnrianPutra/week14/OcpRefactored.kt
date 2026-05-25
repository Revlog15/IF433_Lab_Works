package oop_126621_RevandAnrianPutra.week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double): Double {
        return price * 0.80
    }
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double): Double {
        return price * 0.85
    }
}

class SafeDiscountCalculator(
    private val strategy: DiscountStrategy
) {
    fun calculate(price: Double): Double {
        return strategy.apply(price)
    }
}

fun main() {
    val studentCalculator = SafeDiscountCalculator(StudentDiscount())
    val memberCalculator = SafeDiscountCalculator(MemberDiscount())

    println(studentCalculator.calculate(100_000.0))
    println(memberCalculator.calculate(100_000.0))
}