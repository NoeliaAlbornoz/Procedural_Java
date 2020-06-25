package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-12: Dados N y M números naturales, informar su producto por sumas
         * sucesivas.
         */

        int numero, multiplicacion, sumasSucesivas = 0;

        System.out.println("Ingresar un número: ");
        numero = Teclado.nextInt();

        System.out.println("Ingresar el número de veces que se sumarán los numeros: ");
        multiplicacion = Teclado.nextInt();

        for (int i = 0; i < multiplicacion; i++) {

            sumasSucesivas += numero;

        }

        System.out.println("El resultado de las sumas sucesivas es: " + sumasSucesivas);

    }
}