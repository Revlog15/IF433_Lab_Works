package oop_126621_RevandAnrianPutra.week11

fun panggil_nama(nama:String):String{
    return "hai $nama";
}

fun String.panggilmahasiswa():String{
    //return "Hello $this"
    var hasil=this.split(" ").joinToString(" "){
        it.replaceFirstChar{
            c -> c.uppercase()
        }
    }
    return hasil;
}
fun Int.tentukanLulus(nama:String):String{
    var keputusan= ""
    if(this >= 70){
        keputusan="Lulus"
    }else {
        keputusan="remedial"
    }
    return "mahasiswa $nama hasil kelulusan adalah $keputusan";
}

fun String?.cekNullandEmpty():String{
    if(this == null || this.isEmpty()){
        return "gak boleh null atau kosong abangkuh"
    }else{
        return "username kamu adalah $this"
    }
}
class Mahasiswa(){
    var nim:String = " "
    var nama:String = ""
    var ipk:Int= 0

}

fun main (){

    var inputUsername:String? = "Revlog"
    println(inputUsername.cekNullandEmpty())

    println(80.tentukanLulus("Revan"));
    println(panggil_nama("Toni"));

    println("Tonyyy stark iron man".panggilmahasiswa());

    var kampusSaya = "UMN"
    kampusSaya.let{
        if(it == "UMN") {
            println("kampus "+ it + " Sugoi")
        }else {
            println ("amazing $it")
    }
    }

 var alamatSaya="Gading Serpong";
 alamatSaya.run{
     println("Saya tinggal di "+ this)
 }
    var gradeSaya = with (90) {
        if(this >= 80){
            "A"
        }else if (this >= 70){
            "B"
        }else{
            "C"
        }

    }
    println("Grade Kamu Adalah $gradeSaya");

    var dataMahasiswa = Mahasiswa().apply {
        nim = "12345";
        nama= "yudi";
        ipk= 3;
    }
    println("Mahasiswa ${dataMahasiswa.nama} dengan nim ${dataMahasiswa.nim} ipknya ${dataMahasiswa.ipk}")


    var deretAngka = mutableListOf<Int>(80,70,75,68,85)
    deretAngka.also{
        println("Sebelum $deretAngka")
    }.add(90)
    println("setelah $deretAngka")
}