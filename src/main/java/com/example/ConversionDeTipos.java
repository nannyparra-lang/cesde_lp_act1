package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        // TODO
        int numero = 15;
        double resultado = numero;
    }

    public static void demostrarCastingExplicito() {
        // TODO
        double precio = 17.99;
        int entero = (int) precio;
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
        long numeroGrande = 50000;
        short numeroPequeño = (short) numeroGrande;
    }
}