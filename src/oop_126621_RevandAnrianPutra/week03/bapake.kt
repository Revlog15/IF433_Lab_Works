package oop_126621_RevandAnrianPutra.week03

class bapake {
    private var nama : String = "belum tahu";
    private var umur : Int = 35;

    public fun set_nama(namabaru:String) {
        if(this.nama.length <=0) {
            println(" eh nama ga boleh kosong")
        } else {
            this.nama = namabaru;
        }
    }
    public fun get_nama():String {
        return this.nama;
    }

    public fun set_umur(umurbaru:Int) {
        if(this.umur <=0) {
            println(" eh umur ga boleh di bawah 0")
        } else {
            this.umur = umurbaru;
        }
    }
    public fun get_umur():Int {
            return this.umur;
    }
}


fun main() {
    var bpk = bapake();

    bpk.set_nama("Andikaw");
    bpk.set_umur(35)
        println("nama ayah adalah ${bpk.get_nama()} umurnya adalah ${bpk.get_umur()}");
}