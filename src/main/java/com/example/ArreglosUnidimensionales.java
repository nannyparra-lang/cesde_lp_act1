package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
        // TODO
        String[] peliculas = new String[4];
        peliculas[0] = "p1";
        peliculas[1] = "p2";
        peliculas[2] = "p3";
        peliculas[3] = "p4";

        for (String pelicula : peliculas){
            System.out.println(pelicula);
        }
    }

    public static void mostrarLongitud() {
        // TODO
         int [] numeros = {10, 20, 30, 40};
        System.out.println("la longitud del arreglo es: " + numeros.length);
    }

    public static void recorrerConForClasico() {
        // TODO
        int [] numeros = {5 , 10, 15, 20};
        for (int = 0; i < numeros.length; i++) {
            System.out.println(numeros [i]);
        }
    }

    public static void recorrerConForEach() {
        // TODO
        int [] numeros = {10, 20,30, 40};
        for (int numero : numero) {
            System.out.println(numero);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] array) {
        // TODO
        for (int i= 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}