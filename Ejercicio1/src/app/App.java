package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-1 Enunciado: A partir de dos valores enteros A y B, informar la suma,
         * la diferencia (A menos B), y el producto.
         */

        int a, b, suma, resta, multiplicacion;

        System.out.println("Ingresar el primer número: ");
        a = Teclado.nextInt();

        System.out.println("Ingresar el segundo número: ");
        b = Teclado.nextInt();

        suma = a + b;

        resta = a - b;

        multiplicacion = a * b;

        System.out.println("La suma es " + suma);
        System.out.println("La diferencia es " + resta);
        System.out.println("El producto es " + multiplicacion);

    }
}