package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-15: Ingresar e informar valores, mientras que el valor ingresado no
         * sea negativo. Informar la cantidad de valores ingresados.
         */

        int cantidad = 0;

        // While: Primero pregunto, después hago.

        int numero;

        System.out.println("Ingrese un número (finaliza cuando ingresa cero o un número negativo): ");
        numero = Teclado.nextInt();

        while (numero > 0) {

            cantidad++; // cantidad = cantidad + 1

            System.out.println("El número ingresado fue: " + numero);

            System.out.println("Ingrese un número (finaliza cuando ingresa cero o un número negativo): ");
            numero = Teclado.nextInt();

        }

        System.out.println("Ingresaste " + cantidad + " números positivos.");

    }
}