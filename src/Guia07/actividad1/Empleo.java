
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
}
