package Taller4.Ejercicio3;

public class MainPrueba {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        // Línea errónea:
        System.out.println(miCuenta.saldo);
        // Error de compilación: 'saldo has private access in Cuenta'
    }
}