package Taller4.Ejercicio2;

// Coche.java
public class Coche {
    // 1. Propiedades privadas
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima > 0 ? velocidadMaxima : 0;
    }

    // 2. Método acelerar que incrementa si el valor es positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
        }
    }

    // Getters necesarios para la prueba
    public double getVelocidadMaxima() { return velocidadMaxima; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}
