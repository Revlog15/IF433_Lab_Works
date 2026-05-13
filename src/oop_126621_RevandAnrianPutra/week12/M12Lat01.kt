package oop_126621_RevandAnrianPutra.week12

fun pembagian(pembilang:Int, penyebut:Int) {
    try {
        val hasilBagi = pembilang / penyebut;
        println("hasil bagi: $hasilBagi")
    } catch (e: Exception) {
        println("error di pembagian:${e.message}")
    } finally {
        println("Selesai diPembagian")

    }
}

fun cek_tipe_data(){
    var angka:Int = try{
        Integer.parseInt("90")
    }catch (e:Exception){
        println("ada error di cektipedata ${e.message}")
        111
    }
    println("angka: $angka")
}


fun cek_saldo(saldoSaya:Int){
    if(saldoSaya<1000){
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")

    }else {
        println("selamat anda kaya")
    }
}

class CekNilaiKKM(val kkm:Int, val nilai:Int): Exception("Nilai ${nilai} berada dibawah KKM $kkm")

class nilai_siswa(val kkm:Int) {
    fun input_nilai(nilaiKamu: Int) {
        if (nilaiKamu < kkm) {
            throw CekNilaiKKM(kkm, nilaiKamu)
        } else {
            println("kamu lulus,nilai $nilaiKamu")
        }
    }
}

fun contoh_multiple_catch(nilai:String){
    try{
        val angka:Int = Integer.parseInt(nilai)
        val hasil:Int = angka/0;
        println("hasil nilainya: $hasil")
    }catch (e:NumberFormatException){
        println("error salah format ${e.message}")


    }catch (e: ArithmeticException){
        println("error salah aritmatika ${e.message}")

    }  catch (e:Exception){
        println("error program : ${e.message}")
    }
}

sealed class ATMException(pesan : String): Exception(pesan)

class saldo_dibawah_nol (val saldoKamu : Int):
    ATMException("Masa saldo $saldoKamu minus")
class cek_jumlah_saldo(val saldoAwal: Int, val jajan: Int ):
    ATMException("Saldo tinggal $saldoAwal, kamu jajan $jajan, ga cukup bang")

fun mulai_jajan(saldoAwalKamu:Int, jajanKamu : Int): Int{
    if (jajanKamu > saldoAwalKamu) {
        throw cek_jumlah_saldo(saldoAwalKamu, jajanKamu)
    }else if (saldoAwalKamu < 0 ){
        throw saldo_dibawah_nol(saldoAwalKamu)
    }else {
        println("Transaksi berhasil!!!")
    }
    return saldoAwalKamu - jajanKamu
}



fun main(){

    runCatching { mulai_jajan(1000, 900) }
        .onSuccess { println("Transaksi Sukses : $it")}
    .onFailure { println("Tramsalso Gagal $it") }



    contoh_multiple_catch("100")

    val nsiswa = nilai_siswa(70)
    try {
        nsiswa.input_nilai(60)
    }catch (e:Exception){
        println("ada error saat input nilai ${e.message}")
    }
    cek_saldo(1200);

    cek_tipe_data();

    pembagian(10,0)
}