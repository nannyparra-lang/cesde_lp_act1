package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        // TODO
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
    }

    public static void ejemploIfElse() {
        // TODO
        int nota = 18;
        if (nota >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }
    }

    public static void ejemploIfElseIfElse() {
        // TODO
        int nota = 5;
        if (nota >= 4.5) {
            System.out.println("Exelecte");
        } else if (nota >=3) {
            System.out.println("Aprobó");
        } else {
            System.out.println("Perdió");
        }
    }

    public static void ejemploSwitch() {
        // TODO
        int dia = 3;
        
        switch (día) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                    break;

            case 3:
                System.out.println("miercoles");
                        break;
        
            default:
                System.out.println("Otro día");
                break;
        }
    }

    public static void ejemploSwitchExpression() {
        // TODO
        int dia = 1;

        String nombre = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> " Martes";
            default -> "Otro dia";
        };
        System.out.println(nombre);
    }
}