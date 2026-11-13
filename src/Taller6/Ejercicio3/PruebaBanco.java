package Taller6.Ejercicio3;

public class PruebaBanco {
    public static void main(String[] args) {
        Banco cuenta = new Banco(1000.00);

        // cuenta.saldo = -5000; // Esto ya no es posible porque 'saldo' es private

        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        cuenta.depositar(500.00);
        cuenta.retirar(200.00);
        cuenta.retirar(2000.00); // Validación protege la integridad del dato
        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}