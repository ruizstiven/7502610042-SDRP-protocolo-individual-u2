package Taller4.Ejercicio1;


public class Estudiante {
    // 1. Propiedades privadas
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        setEdad(edad);         // Usamos el set para aplicar la validación
        setNotaPromedio(notaPromedio);
    }

    // 2. Métodos Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { // Validación: la edad no puede ser negativa
            this.edad = edad;
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) { // Validación: escala de 0 a 5
            this.notaPromedio = notaPromedio;
        }
    }
}
