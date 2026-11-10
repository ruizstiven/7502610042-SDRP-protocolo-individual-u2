package Taller4.Ejercicio1;


public class PruebaEstudiante {
    public static void main(String[] args) {
        // 3. Creación de la instancia
        Estudiante estudiante = new Estudiante("Carlos Ortega", 20, 4.2);

        // Acceso correcto mediante métodos públicos
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota: " + estudiante.getNotaPromedio());

        // Intento de asignar una edad inválida
        estudiante.setEdad(-5);
        System.out.println("Edad después del intento inválido: " + estudiante.getEdad()); // Mantiene 20
    }
}
