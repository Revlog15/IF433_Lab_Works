package oop_126621_RevandAnrianPutra.week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(
    private val width: Int,
    private val height: Int
) : Shape {
    override fun area(): Int {
        return width * height
    }
}

class SafeSquare(
    private val side: Int
) : Shape {
    override fun area(): Int {
        return side * side
    }
}

fun main() {
    val rectangle: Shape = SafeRectangle(width = 10, height = 5)
    val square: Shape = SafeSquare(side = 5)

    println("Rectangle area: ${rectangle.area()}")
    println("Square area: ${square.area()}")
}