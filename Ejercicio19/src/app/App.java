package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Ej. MI-19: Dados 10 valores informar el mayor.

        int numero;
        int mayor = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingresar un número: ");
            numero = Teclado.nextInt();

            if (i == 0) {
                mayor = numero;
            } else if (numero > mayor) {
                mayor = numero;
            }

        }

        System.out.println("El mayor es " + mayor);
    }
}