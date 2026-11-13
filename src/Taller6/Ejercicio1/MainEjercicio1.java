package Taller6.Ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura Gómez", 4500.00, "Tecnología");
        Empleado empleado = new Empleado("Jorge Perez", 2500.0);
        gerente.mostrarInformacion();
        empleado.mostrarInformacion();
    }
}