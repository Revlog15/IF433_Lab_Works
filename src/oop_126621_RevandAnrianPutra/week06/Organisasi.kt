package oop_126621_RevandAnrianPutra.week06

interface Organisasi {
    val namaOrg: String;
    val budgetRapat: Int;
    val jmlOrg: Int;
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg;


    fun rapat();
    fun keaktifan(){
        println("kamu bawel ya")
    }
}