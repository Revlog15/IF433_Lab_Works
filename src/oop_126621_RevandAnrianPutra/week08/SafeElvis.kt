package oop_126621_RevandAnrianPutra.week08

class Alamat(val nomor:Int, val kota:String);
class Mahasiswa(val nim:String, val addr:Alamat?);

fun main () {
val almt = Alamat(47, "Bandung");
val mhs = Mahasiswa("126621", null);

    val defaultAlamat = mhs.addr?.let{
     alamatAsli -> "Disini${mhs.addr.kota} nomor ${mhs.addr.nomor}";
    }?:"Gak JELAS,gatau dimana"

println("Nimnya ${mhs.nim} Alamatnya ${defaultAlamat}")
}