package oop_126621_RevandAnrianPutra.week05

class Admin(nama: String, val idAdmin: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengelola administrasi kampus.")
    }

    fun kelolaData() {
        println("$nama sedang mengelola data akademik.")
    }
}