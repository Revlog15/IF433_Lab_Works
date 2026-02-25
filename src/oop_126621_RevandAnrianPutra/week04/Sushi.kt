package oop_126621_RevandAnrianPutra.week04

class Sushi:Makanan() {
   private var jenis:String ="";
    public fun sushi_terjual(jns:String, jml:Int) {
        this.jenis = jns;
        harga = jml * 100;
        println("Sushi $jenis laku $harga");
    }
}