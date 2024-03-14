package org.pebiblioteca

fun main() {

    val biblioteca = GestorBiblioteca()

    val libro1 = Libro("1","Sevilla", "España", 1492, "Historia")
    val libro2 = Libro("2","Cádiz", "España", 2000, "Geografía")
    val libro3 = Libro("3","Madrid", "España", 1492, "Economía")

    biblioteca.prestar(libro1)
}