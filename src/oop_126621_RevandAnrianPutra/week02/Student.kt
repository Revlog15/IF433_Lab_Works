package oop_126621_RevandAnrianPutra.week02

class Student(
    val nim: String,
    var name: String,
    var major: String
) {

    constructor(nim: String, name: String) : this(nim, name, "Non-Matriculated")

    init {
        if (nim.length != 10) {
            println("WARNING: NIM tidak valid (harus 10 digit)")
        }

        if (name.isBlank()) {
            println("WARNING: Nama tidak boleh kosong")
        }
    }
}

