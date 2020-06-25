package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-37: Desarrollar un procedimiento tal que dada una fecha (AAAAMMDD) y
         * un número natural que representa una cantidad de días, calcule y retorne la
         * nueva fecha en tres parámetros año (AAAA), mes (MM) y día (DD) que resulte de
         * incrementar al parámetro fecha con el parámetro cantidad de días.
         */

        int fecha, dias, dia, mes, año;

        fecha = ingresarFecha();

        dias = ingresarDiasExtras();

        dia = fecha % 100;
        mes = (fecha / 100) % 100;
        año = fecha / 10000;

        dia += dias;

        nuevaFecha(dia, mes, año, dias);

    }

    public static int ingresarFecha() {
        int fecha;

        System.out.println("Ingresar una fecha (AAAAMMDD): ");
        fecha = Teclado.nextInt();

        return fecha;

    }

    public static int ingresarDiasExtras() {
        int dias;

        System.out.println("Ingresar días (hasta 31): ");
        dias = Teclado.nextInt();

        return dias;

    }

    public static boolean bisiesto(int año) {

        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static void nuevaFecha(int dia, int mes, int año, int dias) {

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (dia > 31) {
                    mes++;
                    dia = dia - 31;
                }
                break;
            case 2:
                if (bisiesto(año)) {
                    if (dia > 29) {
                        mes++;
                        dia = dia - 29;
                    }
                } else {
                    if (dia > 28) {
                        mes++; 
                        dia = dia - 28;
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30) {
                    mes++;
                    dia = dia - 30;
                }
                break;
            case 12:
                if (dia > 31) {
                    año++;
                    mes = 1;
                    dia = dia - 31;
                }
                break;
        }

        System.out.println("Nueva fecha: ");
        System.out.println("Año (" + año + ") " + "Mes (" + mes + ") " + "Día (" + dia + ").");

    }
}