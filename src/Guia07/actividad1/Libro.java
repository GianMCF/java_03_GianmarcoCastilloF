
package Guia07.actividad1;

class Libro {
    // Atributos
    private String titulo;
    private String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método con valor de retorno
    public String obtenerDetalles() {
        return "Título: " + titulo + ", Autor: " + autor;
    }

    // Método con parámetros
    public void cambiarAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }
}
