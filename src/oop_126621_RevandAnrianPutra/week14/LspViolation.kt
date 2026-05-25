package oop_126621_RevandAnrianPutra.week14

open class Rectangle {
    open var width: Int = 0
    open var height: Int = 0

    fun area(): Int {
        return width * height
    }
}

class Square : Rectangle() {
    override var width: Int = 0
        set(value) {
            field = value
            super.height = value
        }

    override var height: Int = 0
        set(value) {
            field = value
            super.width = value
        }
}

fun main() {
    val rectangle: Rectangle = Square()

    rectangle.width = 10
    rectangle.height = 5

    println("Area: ${rectangle.area()}")
}