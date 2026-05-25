package oop_126621_RevandAnrianPutra.week14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

interface Faxable {
    fun fax(doc: String)
}

class ModernSimplePrinter : Printable {
    override fun print(doc: String) {
        println("Printing securely $doc")
    }
}

class OfficePrinter : Printable, Scannable, Faxable {
    override fun print(doc: String) {
        println("Office printing $doc")
    }

    override fun scan(doc: String): String {
        return "Scanned file: $doc"
    }

    override fun fax(doc: String) {
        println("Faxing $doc")
    }
}

fun main() {
    val simplePrinter = ModernSimplePrinter()
    simplePrinter.print("Report.pdf")

    val officePrinter = OfficePrinter()
    officePrinter.print("Invoice.pdf")
    println(officePrinter.scan("Invoice.pdf"))
    officePrinter.fax("Invoice.pdf")
}