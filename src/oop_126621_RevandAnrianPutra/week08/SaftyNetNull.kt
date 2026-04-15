package oop_126621_RevandAnrianPutra.week08

fun main()  {
    var nama:String? = null;

    try {
        println("nama kamu ${nama!!.uppercase()}");
    }catch (ex:Exception) {
        println("Error Adalah: ${ex.message}");
    }
}