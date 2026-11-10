package Taller4.Ejercicio2;

// PruebaCoche.java
public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 180);

        // 3. Intentos de acceso directo (PROVOCAN ERROR DE COMPILACIÓN)
        // Si eliminas los comentarios '//' de abajo, el programa no compilará:

        // miCoche.marca = "Ford";             // Error: marca has private access in Coche
        // miCoche.velocidadMaxima = 300;     // Error: velocidadMaxima has private access in Coche

        // Uso correcto a través de la interfaz pública
        System.out.println("Velocidad Máxima original: " + miCoche.getVelocidadMaxima() + " km/h");
        miCoche.acelerar(20);
        System.out.println("Nueva Velocidad Máxima: " + miCoche.getVelocidadMaxima() + " km/h");
    }
}
