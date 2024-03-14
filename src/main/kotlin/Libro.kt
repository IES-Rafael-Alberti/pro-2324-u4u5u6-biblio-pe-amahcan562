package org.pebiblioteca

import java.util.UUID;

data class Libro(
    var id: String,
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int,
    val tematica: String,
    var estado: EstadoLibro = EstadoLibro.DISPONIBLE
)
{
    init {
        require(id.isNotEmpty()) { "El id del libro no puede estar vacío" }
        require(titulo.isNotEmpty()) { "El título del libro no puede estar vacío" }
        require(autor.isNotEmpty()) { "El autor del libro no puede estar vacío" }
        require(anioPublicacion in 1..2024) { "El año de publicación del libro debe ser entre 1 y 2024" }
        require(tematica.isNotEmpty()) { "La temática del libro no puede estar vacía" }
    }

    override fun toString(): String {
        return "Libro -> Id: $id, titulo: $titulo, autor: $autor, anioPublicacion: $anioPublicacion, tematica: $tematica', estado: $estado)"
    }
}
