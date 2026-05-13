package oop_126621_RevandAnrianPutra.week12

fun main() {

    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {

        "42X".toInt()
    }
}