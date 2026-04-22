package oop_126621_RevandAnrianPutra.week09

fun main() {
    println("======= LIST OF IMUT=======");
    val arSiswa= listOf("Budi", "Danu", "Susi", "Cica");
    //view
    println(arSiswa);

    //panjang  array
    println("BANYAK SISWA:"+ arSiswa.size);
    //MUNCULIN 1 orng
    println("siswa bernama ${arSiswa[1]}");

    //for-each
    for(a in arSiswa){
        print("siswa " + a + " dan " );
    }

    println("===========LIST OF MUTABLE===========");
    val arMatkul = mutableListOf("OOP","penweb","matdis","Kalkulus")
    arMatkul.add("algo");
    arMatkul[2]="aljabar linear"
    arMatkul.remove(element = "penweb")
    println(arMatkul);

    println("========= Set of Imut=========");
    val arNilai = setOf(80, 90, 75, 80, 90, 85,12,30);
    println("banyak nilai: ${arNilai.size}");
    println("ada angka 90? ${arNilai.contains(90)}");
    println(arNilai);

    println("========= Set of Mutable=========");
    val arMahasiswa = mutableSetOf("andi", "yanto", "udin", "yuda");
    arMahasiswa.add("yanti");
    arMahasiswa.remove(element = "udin")
    arMahasiswa.add("udin");
    println(arMahasiswa);


    println("========= Set of imut=======");
val arResto = mapOf(
    "ayam" to 5000,
    "Bakpao" to 3000,
    "Sayur asem" to 2500

)
    println("banyak menu ${arResto.size}");
    println("harga ayam ${arResto["ayam"]}");
    println("list makanan ${arResto.keys}");
    println("list harga ${arResto.values}");
    println(arResto);


    println("========= Set of mutable=======");
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove(key = "Ara")
    arKHS["Nika"] = 92
    arKHS["asemena"] = 100
    println(arKHS);


    println("========= LAMDA =========");

    fun tambah(a:Int, b:Int):Int{
        return a+b;
    }
    println("hasil tambah 5 + 3 = " + tambah(5,3));

    val kurang = { a:Int, b:Int-> a-b}
    println("hasil pengurangan ${kurang(5,3)}");


    println("========= LAMDA {IT} =========");
    val pangkat = {a:Int -> a*a}
    val hasilPangkat: (Int) -> Int = { it * it}
    println("hasil pangkat ${hasilPangkat(5)}");

println("===== FOREACH BIASA =====")
    for(a in arMatkul) {
        println(a);
    }

    println("========= FOREACH IT =====")

    arMatkul.forEach{
        println(it)
    }


    println("========= FOREACH VARIABLE =====")

    arMatkul.forEach{
        mk->println(mk)
    }




}