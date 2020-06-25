package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-13: Dados 50 números enteros, informar el promedio de los mayores que
         * 100 y la suma de los menores que –10.
         */

        int numero;
        int contador = 0;
        int sumaMayor = 0;
        int sumaMenor = 0;
        int promedio = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese un número: ");
            numero = Teclado.nextInt();

            if (numero > 100) {

                contador++;
                sumaMayor += numero;

            } else if (numero < -10) {

                sumaMenor += numero;

            }

        }

        promedio = sumaMayor / contador;

        System.out.println("El promedio de los mayores a 100 es " + promedio);
        System.out.println("La suma de los menores a -10 " + sumaMenor);

    }
}