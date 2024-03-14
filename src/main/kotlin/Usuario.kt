package org.pebiblioteca

class Usuario(
    val id: Int,
    val nombre: String,
    val librosPrestados: MutableList<Libro> = mutableListOf()
) {
    constructor(id: Int, nombre: String) : this(id, nombre, mutableListOf())

    fun agregarLibro(libro: Libro) {
        librosPrestados.add(libro)
    }

    fun quitarLibro(libro: Libro) {
        librosPrestados.remove(libro)
    }

    fun consultarLibrosPrestados() {
        println("Libros prestados a $nombre:")
        librosPrestados.forEach { println(it) }
    }
}