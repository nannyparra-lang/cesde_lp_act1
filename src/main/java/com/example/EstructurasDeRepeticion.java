package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        // TODO
        int numero = 1;
        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }
    }

    public static void ejemploDoWhile() {
        // TODO
        int numero =1;
        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 5);
    }

    public static void ejemploForClasico() {
        // TODO
        for (int i = 1; i<= 5; i++) {
            System.out.println(i);
        }
    }

    public static void ejemploForAnidado() {
        // TODO
        for (int i = 1; i<= 3; i++) {
            for (int j = 1; j<= 2; j++) {
                System.out.println("i:" + i + "j" + j);
            }
        }
    }

    public static void ejemploBreakContinue() {
        // TODO
        for (int i = 1; i<=5; i++) {
            if (i == 3) {
                continue;
            }
            
            System.out.println(i);
        }
    }

    public static void ejemploEtiquetas() {
        // TODO
        inicio:

        for(int i = 1; i<=3; i++) {

            for (int j = 1; j <=3; j++) {

                if (j == 2) {
                    break inicio;
                }
            }
        }
    }
}