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
         double resultado;

         base = ingresarBase();
         exponente = ingresarExponente();
         resultado = potencia(base, exponente);
         imprimirPotencia(resultado);

    }

    public static int ingresarBase(){

        int base;

        System.out.print("Ingresar base: ");
        base = Teclado.nextInt();

        return base;

    }

    public static int ingresarExponente(){

        int exponente;

        System.out.print("Ingresar exponente: ");
        exponente = Teclado.nextInt();

        return exponente;

    }

    public static double potencia(int base, int exponente){

        return Math.pow(base, exponente);

    }

    public static void imprimirPotencia(double resultado) {

        System.out.println("La potencia es " + resultado);

    }
}