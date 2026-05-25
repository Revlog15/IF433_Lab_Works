package oop_126621_RevandAnrianPutra.week14

class khs_mahasiswa {
    fun hitung_tugas(quiz:Double, tugasHarian:Double):Double {
        return (quiz*0.3) + (tugasHarian*0.7)
    }
    fun hitung_NA(uts:Double, uas:Double, tugas:Double, jamanPilih: Bobot_persen_jaman):Double {
        return jamanPilih.bobot_nilai_jaman(uts, uas, tugas)
    }
}

interface Bobot_persen_jaman {
    fun bobot_nilai_jaman(uts:Double, uas:Double, tugas: Double): Double
}
class jamanCovid: Bobot_persen_jaman {
    override fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double):Double {
        return (uts*0.2) + (uas*0.3) + (tugas*0.4)
    }
}
class JamanNewNormal: Bobot_persen_jaman {
    override fun bobot_nilai_jaman(uts: Double, uas: Double, tugas: Double): Double {
        return (uts*3) + (uas*0.4) + (tugas*0.3)
    }
}

class simpan_khs {
    fun simpan_nilai_db(nim:String, nama:String, nilaiAkhir:Double) {
        println("Data si $nim $nama dengan nilai $nilaiAkhir disimpan")
    }
    fun load_nilai_db(nim:String) {
        println("Berikut data mahasiswa dengan nim $nim")
    }
}

fun main(){
    val khsMhs = khs_mahasiswa()
    val dataTugas:Double = khsMhs.hitung_tugas(81.5, 89.7)

    val naMhs:Double = khsMhs.hitung_NA(80.45, 90.36, dataTugas, jamanCovid())

    val saveKHS = simpan_khs()
    saveKHS.simpan_nilai_db("111", "Rudi", naMhs)
}
