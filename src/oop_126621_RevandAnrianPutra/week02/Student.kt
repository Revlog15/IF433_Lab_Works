package oop_126621_RevandAnrianPutra.week02

class Student(
    val nim: String,
    var name: String,
    var major: String,
    var gpa: Double = 0.0
) {

    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated")

    init {
        if (nim.length != 5) {
            println("WARNING: NIM tidak valid (harus 5 digit)")
        }

        if (name.isBlank()) {
            println("WARNING: Nama tidak boleh kosong")
        }
    }
}

