package oop_126621_RevandAnrianPutra.week02

class Pemain {
    var nama: String= "tidak terdaftar"
    var speed:Int= 9;
    val shoot:Int=8;

    init{
        nama= "Revlog"
        println("ini adalah constructor")
    }

    constructor(alias:String="king revand",kecepatan:Int=2){
        nama= alias;
        speed = kecepatan;
        println("ini adalah secondary constructor");
    }

    fun bawa_bola() {
        println("si $nama sedang membawa bola")

    }
}

fun main() {
    val player = Pemain(alias ="yoel", kecepatan=100);
    player.bawa_bola();
    println("nama pemain:${player.nama}")
    println("speed pemain:${player.speed}")
}