package app;

import java.util.Scanner;

public class App {

    //Calcular el volumen de un cubo.

    // Declaración del Teclado
    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Declaración de variable a
        int a;

        System.out.println("Ingrese la altura:");
        // Leo del tecldo el primer numero
        a = Entrada.nextInt();

        // Declaración de variable b
        int b;

        System.out.println("Ingrese la base:");
        // Leo la variable b desde el teclado
        b = Entrada.nextInt();

        // Declaración de variable p
        int p;

        System.out.println("Ingrese la profundidad:");
        // Leo la variable p desde el teclado
        p = Entrada.nextInt();

        // Declaración variable volumen
        int v;

        // Cálculo del volumen
        v = a * b * p;

        // Muestro por pantalla
        System.out.println("El volumen es " + v);

    }
}