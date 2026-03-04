package oop_126621_RevandAnrianPutra.week05

fun main() {

    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti", idAdmin = "A001")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {

            is Dosen -> {
                println("-> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("-> Terdeteksi sebagai Admin")
                pegawai.kelolaData()
            }
        }

        println("--------------------------")
    }

    val mathHelper = MathHelper()
    println(mathHelper.hitungLuas(4))
    println(mathHelper.hitungLuas(5, 6))
    println(mathHelper.hitungLuas(7.0))
}