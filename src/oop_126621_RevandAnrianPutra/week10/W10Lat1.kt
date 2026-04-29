package oop_126621_RevandAnrianPutra.week10

class rumah(val alamat:Any)

class kampus<T>(val alamat:T)

class Komputer<T,V>(val merk:T, val barcode:V)

fun<T> Password(isiPass:T):T {
    return isiPass;
}

class kalkulator<T:Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt()
    }

    fun kurang(): Double {
        return a.toDouble() - b.toDouble()

    }
}


fun<T>penilaian(list:List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter { it >= kkm }
}

fun main(){
    println(" ===== GENERIC WHERE =====")
    val daftarNilai = listOf(70, 85, 78, 92, 40, 95, 80, 82, 50, 89)
    println("Daftar Nilai: $daftarNilai")
    val nilaiAtasKKM = penilaian(list=daftarNilai, kkm=75)
    println("Nilai diatas KKM: $nilaiAtasKKM")


    println("===== SAMPLE GENERIC - Constraint  =====");
    val kalk = kalkulator(10.52, 20.347);
    println("Hasil tambah ${kalk.a} di tambah ${kalk.b}:" + kalk.tambah());
    println("Hasil kurang ${kalk.a} di kurang ${kalk.b}:" + kalk.kurang());

    println("===== SAMPLE GENERIC - Multi Para  =====");
    val komp = Komputer("Asus", "123456789");
    println("merk komputer :" + komp.merk);
    println("barcode komputer :${komp.barcode}");

    println("===== SAMPLE GENERIC = Function =====");
    println("Password kamu:" + Password(isiPass = 12345))



    println("===== SAMPLE NON-GENERIC  =====");
    val rmh = rumah(alamat = 200);
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("===== SAMPLE GENERIC  =====");
    val kmps = kampus(alamat = 300);
    println(kmps.alamat + 50);
}
