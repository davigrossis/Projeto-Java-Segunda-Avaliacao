package org.example;

public class Fatura {

    // classe de sobrecarga e metodos
    public static double calcularConta(double diaria, int dias) {
        return diaria * dias;
    }

    public static double calcularConta(double diaria, int dias, double desconto) {
        return (diaria * dias) - desconto;
    }
}
