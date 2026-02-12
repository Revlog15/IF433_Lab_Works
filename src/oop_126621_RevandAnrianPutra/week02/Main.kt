package oop_126621_RevandAnrianPutra.week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    println("Status: Pendaftaran Selesai.")
    println()

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {

        val s1 = Student(name, nim, major)
        println("LOG: Menggunakan constructor jalur reguler.")
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {

        val s2 = Student(name, nim)
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}


