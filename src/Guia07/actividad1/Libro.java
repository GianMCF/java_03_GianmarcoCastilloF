
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

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro libro1 = new Libro("1984", "George Orwell");

        // Mostrar detalles del libro
        System.out.println(libro1.obtenerDetalles());

        // Cambiar autor y mostrar los nuevos detalles
        libro1.cambiarAutor("Orwell G.");
        System.out.println(libro1.obtenerDetalles());
    }
}