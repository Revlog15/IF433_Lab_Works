package oop_126621_RevandAnrianPutra.week13

import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")

    val unsafeFile = File("unsafe_logs.txt")

    // Membuka stream secara manual
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // BAHAYA:
    // Jika terjadi exception sebelum close(),
    // resource bisa tidak tertutup dengan benar.

    // Wajib dipanggil manual jika tidak memakai blok use
    writer.close()

    println("Proses penulisan unsafe selesai.")
}