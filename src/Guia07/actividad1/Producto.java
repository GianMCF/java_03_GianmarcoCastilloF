
package Guia07.actividad1;

class Producto {
    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método con valor de retorno
    public double obtenerPrecio() {
        return precio;
    }

    // Método con parámetros
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
