package Taller5.Ejercicio1;

public class PruebaProducto {
    public static void main(String[] args) {
        // Se accede al constructor default porque están en el mismo paquete
        Producto p1 = new Producto("Teclado Mecánico", 85.50, 15);

        // Se accede directamente a los atributos default
        p1.precio = 79.99;
        p1.stock = 14;

        // Se accede al método default
        p1.mostrarInfo();
    }
}