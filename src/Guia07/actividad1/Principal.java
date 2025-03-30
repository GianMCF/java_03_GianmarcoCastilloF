
package Guia07.actividad1;

public class Principal {
    

// Método principal para probar la clase
    public static void main(String[] args) {
        
        // Crear un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Laura", 2500.00);

        // Mostrar salario anual
        System.out.println("Salario anual: $" + empleado1.calcularSalarioAnual());

        // Actualizar sueldo y mostrar nuevo salario anual
        empleado1.actualizarSueldo(2800.00);
        System.out.println("Nuevo salario anual: $" + empleado1.calcularSalarioAnual());
    
    
        // Crear un objeto de la clase Producto
        Producto producto1 = new Producto("Laptop", 1200.50);

        // Mostrar precio actual
        System.out.println("Precio actual: $" + producto1.obtenerPrecio());

        // Actualizar precio y mostrar el nuevo precio
        producto1.actualizarPrecio(1100.00);
        System.out.println("Nuevo precio: $" + producto1.obtenerPrecio());
    
    
    // Método principal para probar la clase
    
        // Crear un objeto de la clase Libro
        Libro libro1 = new Libro("1984", "George Orwell");

        // Mostrar detalles del libro
        System.out.println(libro1.obtenerDetalles());

        // Cambiar autor y mostrar los nuevos detalles
        libro1.cambiarAutor("Orwell G.");
        System.out.println(libro1.obtenerDetalles());
    }  
}
