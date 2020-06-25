package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-27: Dado un conjunto de valores enteros, calcular e informar: a)
         * cuántos valores cero hubo, b) promedio de valores positivos, c) sumatoria de
         * valores negativos. Resolver el ejercicio para los siguientes lotes de datos:
         * 1) 167 valores enteros 2) N valores, donde el valor de N debe ser leído
         * previamente 3) El conjunto de valores termina con un valor igual al anterior
         * 4) Se dan N valores, pero el proceso deberá finalizar si se procesan todos
         * los valores o si la cantidad de ceros supera a cuatro 5) Se dan N valores,
         * pero el proceso deberá finalizar si se cumple alguna de las condiciones de 4)
         * o si el promedio de positivos resulta mayor que seis.
         */

        int lote;
        int numero;
        int i = 0;
        int contarCero = 0;
        int contarPositivo = 0;
        double sumaPositivos = 0;
        int sumaNegativos = 0;
        double promedioPositivos = 0;
        int numeroAnterior = 0;
        int consecutivo = 0;

        System.out.println("Ingresar lote: ");
        lote = Teclado.nextInt();

        System.out.println("Ingresar numero: ");
        numero = Teclado.nextInt();

        while (i != 167 && i != lote && contarCero < 4 && promedioPositivos < 6 && consecutivo != 1) {

            if (numero == 0) {
                contarCero++;
            } else if (numero > 0) {
                contarPositivo++;
                sumaPositivos += numero;
                promedioPositivos = sumaPositivos / contarPositivo;
            } else {
                sumaNegativos += numero;
            }

            i++;

            numeroAnterior = numero;

            System.out.println("Ingresar numero: ");
            numero = Teclado.nextInt();

            if (numero == numeroAnterior) {
                consecutivo = 1;
            }

        }

        System.out.println("Cantidad de ceros: " + contarCero);
        System.out.println("Promedio de valores positivos: " + promedioPositivos);
        System.out.println("Sumatoria negativos: " + sumaNegativos);

    }
}