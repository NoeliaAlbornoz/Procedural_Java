package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-35: Desarrollar un procedimiento que imprima una fecha en formato
         * DD/MM/AA. El dato que recibe es un longint con una fecha en formato aaaammdd.
         */

         int fecha, dia, mes, año;

         System.out.println("Introducir fecha: ");
         fecha = Teclado.nextInt();

        dia = dia(fecha);
        mes = mes(fecha);
        año = año(fecha);

        imprimirFechaNueva(dia, mes, año);

    }

    public static int dia(int fecha){

        return fecha % 100;

    }

    public static int mes(int fecha){

        return (fecha / 100) % 100;

    }

    public static int año(int fecha){

        return fecha / 10000;

    }

    public static void imprimirFechaNueva(int dia, int mes, int año){

        System.out.println("Fecha nuevo formato: " + dia + "/" + mes + "/" + año);
    }
}