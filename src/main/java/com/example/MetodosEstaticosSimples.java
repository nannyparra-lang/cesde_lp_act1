package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        // TODO
        public static void encabezado () {

            System.out.println("==== BIENVENIDO ====");
        }
    }

    public static void ejemploPasoParametros(String nombre) {
        // TODO
        System.out.println("Bienvenido " + nombre);
    }

    public static int ejemploRetornoValores() {
        // TODO
        return 8;
        
    }

    public static void ejemploSobrecarga() {
        // TODO
        public static int area (int lado){
            return lado * lado;
        }
    }

    public static void ejemploSobrecarga(int n) {
        // TODO

        public static int area (it base, int altura) {
            
            return base * altura;
        }
    }
}