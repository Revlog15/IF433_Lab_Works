package oop_126621_RevandAnrianPutra.week07

enum class MataKuliah(val jmlsks:Int) {
    OOP(    3),
    GAMEDEV(jmlsks = 4),
    DASPRO(jmlsks = 2);

    fun sks_matkul() {
        println("Jml sksnya $jmlsks")
    }
}