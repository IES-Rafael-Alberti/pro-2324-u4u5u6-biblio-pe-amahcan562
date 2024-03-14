package org.pebiblioteca

class GestorBiblioteca (
    val catalogo: MutableList<Libro> = mutableListOf(),
    val registroPrestamos: MutableList<Libro> = mutableListOf()
) {

    //No he conseguido modificar agregrLibro() para que muestre el nuevo ID.

    fun agregarLibro(libro: Libro) {
        catalogo.add(libro)
        println("-- Libro ${libro.titulo} agregado al catálogo --")
    }

    fun eliminarLibro(libro: Libro) {
        catalogo.remove(libro)
        println("-- Libro ${libro.titulo} eliminado del catálogo --")
    }

    fun prestar(libro: Libro) {
        if (catalogo.contains(libro) && libro.estado == EstadoLibro.DISPONIBLE) {
            libro.estado = EstadoLibro.PRESTADO
            catalogo.remove(libro)
            println("-- Libro ${libro.titulo} prestado --")
        } else {
            println("-- Libro ${libro.titulo} no disponible --")
        }
        // Añadir registro de préstamo
        registroPrestamos.add(libro)
    }

    fun devolver(libro: Libro) {
        if (registroPrestamos.contains(libro) && libro.estado == EstadoLibro.PRESTADO) {
            libro.estado = EstadoLibro.DISPONIBLE
            catalogo.add(libro)
            println("-- Libro ${libro.titulo} devuelto --")
        } else {
            println("-- Libro ${libro.titulo} está disponible, no es posible devolver --")
        }
        // Añadir registro de devolución
        registroPrestamos.add(libro)
    }

    fun consultarDisponibilidad(libro: Libro): Boolean {
        return if (catalogo.contains(libro)) {
            println("-- Libro ${libro.titulo} está disponible --")
            true
        } else {
            println("-- Libro ${libro.titulo} no está disponible --")
            false
        }
    }
    fun mostrarEstadoLibros() {
        println("Estado de los libros en el catálogo:")
        for (libro in catalogo) {
            println("${libro.titulo} - ${libro.estado}")
        }

        println("Estado de los libros en el registro de préstamos:")
        for (libro in registroPrestamos) {
            println("${libro.titulo} - ${libro.estado}")
        }
    }



}