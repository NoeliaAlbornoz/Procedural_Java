package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-11 Enunciado: Informar los primeros 100 números naturales y su
         * sumatoria
         */

        int suma = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("El número es: " + (i + 1));
            // suma = suma + (i + 1);
            suma += i + 1;
        }

        System.out.println("La suma es: " + suma);
    }
}