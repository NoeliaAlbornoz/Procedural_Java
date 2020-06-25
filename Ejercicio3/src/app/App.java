package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /**
         * Ej. MI-3: Dada una terna de números naturales que representan al día, al mes
         * y al año de una determinada fecha informarla como un solo número natural de 8
         * dígitos (AAAAMMDD).
         */

        int año, mes, dia, resultado;

        System.out.println("Ingrese la primera fecha: ");

        System.out.println("Año: ");
        año = Teclado.nextInt();

        System.out.println("Mes: ");
        mes = Teclado.nextInt();

        System.out.println("Día: ");
        dia = Teclado.nextInt();

        resultado = año * 10000 + mes * 100 + dia;

        System.out.println(resultado);

    }
}