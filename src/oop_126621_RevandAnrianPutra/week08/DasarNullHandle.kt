package oop_126621_RevandAnrianPutra.week08

class set_krs(val nim:String, val kodematkul:String?){
    fun matkul_wajib(sks:Int?){
        println("Matkul kamu $kodematkul sksnya $sks");
    }
}
fun main() {
    var nama:String? = "Revand Anrian Putra";
    nama = null;
    println("Hai $nama");

    val settingKRS = set_krs("123", "null");
    println("Nim kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}");
    settingKRS.matkul_wajib(null)
}