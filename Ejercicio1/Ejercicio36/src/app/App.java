package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-36: Desarrollar un procedimiento tal que dados una base y un
         * exponente, enteros positivos, calcule y retorne la potencia.
         */

        int base, exponente;
        double potencia = 0;

        bannerConsigna();

        base = ingresarBase();
        exponente = ingresarExponente();

        potencia = calcularPotencia(base, exponente);

        imprimirPotencia(potencia);

    }

    public static void bannerConsigna() {
        System.out.println("Ingresar una base y un exponenete (enteros positivos): ");

    }

    public static int ingresarBase() {

        int base;

        System.out.print("Base ");
        base = Teclado.nextInt();

        return base;

    }

    public static int ingresarExponente() {

        int exponente;

        System.out.print("Exponente ");
        exponente = Teclado.nextInt();

        return exponente;

    }

    public static double calcularPotencia(int base, int exponente) {

        return Math.pow(base, exponente);

    }

    public static void imprimirPotencia(double potencia) {

        System.out.println("La potencia es: " + potencia);

    }
}