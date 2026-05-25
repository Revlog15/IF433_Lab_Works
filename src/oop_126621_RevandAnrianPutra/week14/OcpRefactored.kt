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