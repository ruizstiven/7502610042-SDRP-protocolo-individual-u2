package Taller6.Ejercicio2.Prueba;

import Taller6.Ejercicio2.Vehiculos.Moto;

public class MainPrueba2 {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Deportiva", "Yamaha", 600);

        // Correcto: llamar a un método público
        miMoto.mostrarMoto();

        // ERROR DE COMPILACIÓN:
        // Las siguientes líneas fallarán al compilar porque 'tipo' y 'marca' son protected
        // y MainPrueba2 está en otro paquete y no hereda de Vehiculo.
        // System.out.println(miMoto.marca);
        // System.out.println(miMoto.tipo);
    }
}