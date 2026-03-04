package oop_126621_RevandAnrianPutra.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("Dosen $nama sedang mengajar.")
    }

    fun mengajar() {
        println("Dosen $nama mengajar di kelas.")
    }
}