package oop_126621_RevandAnrianPutra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    if (nim.length != 10) {
        println("NIM salah! Harus 10 digit.")
        return
    }

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    val student = Student(nim, name, major)

    println("Data berhasil dibuat untuk ${student.name}")
}
