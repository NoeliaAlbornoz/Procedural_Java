package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-6 Dadas dos fechas informar cual es la más reciente. Determine cuales
         * serían los datos de entrada y las leyendas a informar de acuerdo al proceso
         * solicitado.
         */

        int año, mes, dia, fecha1, fecha2;

        System.out.println("Ingrese la primera fecha: ");

        System.out.println("Año: ");
        año = Teclado.nextInt();

        System.out.println("Mes: ");
        mes = Teclado.nextInt();

        System.out.println("Día: ");
        dia = Teclado.nextInt();

        fecha1 = año * 10000 + mes * 100 + dia;

        System.out.println("Ingrese la segunda fecha: ");

        System.out.println("Año: ");
        año = Teclado.nextInt();

        System.out.println("Mes: ");
        mes = Teclado.nextInt();

        System.out.println("Día: ");
        dia = Teclado.nextInt();

        fecha2 = año * 10000 + mes * 100 + dia;

        if (fecha1 > fecha2) {
            System.out.println("La primera fecha es la más reciente");
        } else {
            System.out.println("La segunda fecha es la más reciente");
        }

    }
}