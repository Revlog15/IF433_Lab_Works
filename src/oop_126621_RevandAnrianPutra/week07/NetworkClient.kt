package oop_126621_RevandAnrianPutra.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}