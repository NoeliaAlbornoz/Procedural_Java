package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int año;
        String mes;

        System.out.println("Ingresar año: ");
        año = Teclado.nextInt();
        Teclado.nextLine();

        System.out.println("Ingresar el nombre del mes: ");
        mes = Teclado.nextLine();

        mes = mes.toLowerCase();

        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("El mes tiene 31 días.");
                break;
            case "febrero":
                if (año % 4 == 0 && año % 100 != 0)
                    System.out.println("El mes tiene 29 días.");
                else if (año % 400 == 0)
                    System.out.println("El mes tiene 29 días.");
                else
                    System.out.println("El mes tiene 28 días.");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("El mes tiene 30 días.");
                break;
        }

    }
}