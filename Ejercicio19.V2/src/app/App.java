package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //While.

        int numero;
        int mayor = 0;
        int i = 0;

        System.out.println("Ingresar un número: ");
        numero = Teclado.nextInt();

        mayor = numero;

        while(i < 9) {

            System.out.println("Ingresar un número: ");
            numero = Teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            i++;

        }

        System.out.println("El mayor es " + mayor);
    }
}