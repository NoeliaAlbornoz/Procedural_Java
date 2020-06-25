package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int maximoNumero = 0;
        int numero;

        // 10, 3, 17, 12, 8, 5

        for (int i = 0; i < 6; i++) {

            System.out.println("Ingrese el número: " + i + ":");
            numero = Teclado.nextInt();

            if (numero > maximoNumero) {
                maximoNumero = numero;
            }

        }
        System.out.println("El maximo es: " + maximoNumero);

    }

}