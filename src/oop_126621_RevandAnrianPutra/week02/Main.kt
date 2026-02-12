package oop_126621_RevandAnrianPutra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Pilih jalur pendaftaran:")
    println("1. Dengan jurusan")
    println("2. Tanpa jurusan")
    print("Pilihan: ")
    val choice = scanner.nextLine().toInt()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val student = Student(nim, name, major)
        println("Data dibuat untuk ${student.name}")
    } else {
        val student = Student(nim, name)
        println("Data dibuat untuk ${student.name} tanpa jurusan")
    }
}

