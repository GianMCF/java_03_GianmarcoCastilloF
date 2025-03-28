
package Guia07.actividad1;


class Empleado {
    // Atributos
    private String nombre;
    private double sueldoMensual;

    // Constructor
    public Empleado(String nombre, double sueldoMensual) {
        this.nombre = nombre;
        this.sueldoMensual = sueldoMensual;
    }

    // Método con valor de retorno
    public double calcularSalarioAnual() {
        return sueldoMensual * 12;
    }

    // Método con parámetros
    public void actualizarSueldo(double nuevoSueldo) {
        this.sueldoMensual = nuevoSueldo;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Laura", 2500.00);

        // Mostrar salario anual
        System.out.println("Salario anual: $" + empleado1.calcularSalarioAnual());

        // Actualizar sueldo y mostrar nuevo salario anual
        empleado1.actualizarSueldo(2800.00);
        System.out.println("Nuevo salario anual: $" + empleado1.calcularSalarioAnual());
    }
}