package Taller5.Ejercicio3;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 28);

        // Acceso a 'edad' (default): Permitido directamente en el mismo paquete
        persona.edad = 29;
        System.out.println("Edad: " + persona.edad);

        // Acceso a 'nombre' (private): Denegado directamente (generaría error)
        // persona.nombre = "Andrés"; // Error: nombre has private access in Persona

        // Acceso mediante métodos públicos get y set: Permitido
        persona.setNombre("Andrés");
        System.out.println("Nombre: " + persona.getNombre());
    }
}