package org.pebiblioteca

class GestorBiblioteca (
    val catalogo: MutableList<Libro> = mutableListOf(),
    val registroPrestamos: MutableList<Libro> = mutableListOf()
) {



    fun agregarLibro(libro: Libro) {
        catalogo.add(libro)
    }

    fun eliminarLibro(libro: Libro) {
        catalogo.remove(libro)
    }

    fun prestar(libro: Libro) {

    }

    fun devolver(libro: Libro) {

    }

    fun consultarDisponibilidad(libro: Libro): Boolean {
        return catalogo.contains(libro)

    }

}