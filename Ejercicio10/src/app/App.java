package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-10 Se ingresa una edad, mostrar por pantalla alguna de las siguientes
         * leyendas:  ‘menor’ si la edad es menor o igual a 12  ‘cadete’ si la edad
         * está comprendida entre 13 y 18  ‘juvenil’ si la edad es mayor que 18 y no
         * supera los 26  ‘mayor’ en el caso que no cumpla ninguna de las condiciones
         * anteriores
         */

        int edad;

        System.out.println("Ingresar una edad: ");
        edad = Teclado.nextInt();

        if (edad <= 12)
            System.out.println("Menor.");
        else if (edad <= 18)
            System.out.println("Cadete.");
        else if (edad <= 26)
            System.out.println("Juvenil.");
        else
            System.out.println("Mayor.");
    }
}