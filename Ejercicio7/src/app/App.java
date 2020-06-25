package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-7: Dado un triángulo representado por sus lados L1, L2, L3, determinar
         * e imprimir una leyenda según sea: equilátero, isósceles o escálenos.
         */

        int lado1, lado2, lado3;

        System.out.println("Ingresar las longitudes de los lados de un triángulo: ");

        System.out.println("Lado 1: ");
        lado1 = Teclado.nextInt();

        System.out.println("Lado 2: ");
        lado2 = Teclado.nextInt();

        System.out.println("Lado 3: ");
        lado3 = Teclado.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

    }
}