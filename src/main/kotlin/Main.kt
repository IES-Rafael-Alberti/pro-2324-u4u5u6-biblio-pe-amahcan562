package org.pebiblioteca

fun main() {

    val biblioteca = GestorBiblioteca()

    val libro1 = Libro("1","Sevilla", "España", 1492, "Historia")
    val libro2 = Libro("2","Cádiz", "España", 2000, "Geografía")
    val libro3 = Libro("3","Madrid", "España", 1998, "Economía")

    println(libro1.toString())
    println(libro2.toString())
    println(libro3.toString())

    println("------------------------------------------------")

    biblioteca.agregarLibro(libro1)
    biblioteca.agregarLibro(libro2)
    biblioteca.agregarLibro(libro3)

    println("------------------------------------------------")

    println(libro1.toString())

    println("------------------------------------------------")

    biblioteca.prestar(libro1)
    biblioteca.prestar(libro1)
    biblioteca.devolver(libro1)
    biblioteca.devolver(libro1)

    println("------------------------------------------------")

    biblioteca.consultarDisponibilidad(libro1)

    println("------------------------------------------------")

    biblioteca.mostrarEstadoLibros()

}