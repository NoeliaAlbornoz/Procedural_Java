package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-4: A partir de un valor entero ingresado por teclado, se pide
         * informar: a) La quinta parte de dicho valor b) El resto de la división por 5
         * c) La séptima parte del resultado del punto a)
         */

        int numero, quinto, resto, septimo;

        System.out.println("Ingrese un número: ");
        numero = Teclado.nextInt();

        quinto = numero / 5;
        resto = numero % 5;
        septimo = quinto / 7;

        System.out.println("Quinta parte: " + quinto);
        System.out.println("Resto (división por 5): " + resto);
        System.out.println("Séptima parte (de la quinta parte): " + septimo);
    }
}