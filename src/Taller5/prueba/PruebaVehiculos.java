package Taller5.prueba;

// Las siguientes importaciones y usos generan errores de compilación
//import Taller5.vehiculos.Vehiculo;
//import Taller5.vehiculos.Moto;


public class PruebaVehiculos {
    public static void main(String[] args) {
        // ERROR 1: Vehiculo no es visible desde fuera del paquete 'vehiculos'
        // Vehiculo v = new Vehiculo("Automóvil");

        // ERROR 2: Moto tampoco es visible porque no tiene el modificador 'public'
        // Moto m = new Moto();

        // ERROR 3: Aunque las clases fueran públicas, el atributo 'tipo' tiene acceso default
        // System.out.println(m.tipo);
        // System.out.println(v.tipo);
    }
}