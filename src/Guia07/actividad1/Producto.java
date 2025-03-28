
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

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de la clase Producto
        Producto producto1 = new Producto("Laptop", 1200.50);

        // Mostrar precio actual
        System.out.println("Precio actual: $" + producto1.obtenerPrecio());

        // Actualizar precio y mostrar el nuevo precio
        producto1.actualizarPrecio(1100.00);
        System.out.println("Nuevo precio: $" + producto1.obtenerPrecio());
    }
}