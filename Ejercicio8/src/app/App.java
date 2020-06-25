package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-8: Enunciado: Dados un mes y el año correspondiente informar cuantos
         * días tiene el mes.
         */

        int año, mes;

        System.out.println("Ingresar año: ");
        año = Teclado.nextInt();

        System.out.println("Ingresar mes (formato número): ");
        mes = Teclado.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días.");
                break;
            case 2:
                if (año % 4 == 0 && año % 100 != 0)
                    System.out.println("El mes tiene 29 días.");
                else if (año % 400 == 0)
                    System.out.println("El mes tiene 29 días.");
                else
                    System.out.println("El mes tiene 28 días.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días.");
                break;
        }

    }
}