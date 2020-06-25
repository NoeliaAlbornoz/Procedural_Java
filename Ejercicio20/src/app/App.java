package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-20: Dados N valores informar el mayor, el menor y en que posición del
         * conjunto fueron ingresados.
         */

        int n;
        int numero;
        int mayor = 0;
        int menor = 0;
        int posiciónMayor = 0;
        int posiciónMenor = 0;

        System.out.println("Ingresar cantidad de valores a considerar: ");
        n = Teclado.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Ingresar número: ");
            numero = Teclado.nextInt();

            if (i == 0) {

                mayor = numero;
                menor = numero;
                posiciónMayor = (i + 1);
                posiciónMenor = (i + 1);

            } else if (numero > mayor) {

                mayor = numero;
                posiciónMayor = (i + 1);

            } else if (numero < menor) {

                menor = numero;
                posiciónMenor = (i + 1);

            }

        }

        System.out.println("El mayor es " + mayor + " cuya posición es " + posiciónMayor);
        System.out.println("El menor es " + menor + " cuya posición es " + posiciónMenor);

    }
}