package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-9: Enunciado: Dados dos números, mostrar un menú con opciones de
         * sumar, restar o multiplicar dichos números. Solicite elegir una opción.
         */

        int numero1, numero2, opcion, resultado;

        System.out.println("Ingrese el primer número: ");
        numero1 = Teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        numero2 = Teclado.nextInt();

        System.out.println("Elija una opción: 1.Suma 2.Resta 3.Multiplicación");
        System.out.println("Opción: ");
        opcion = Teclado.nextInt();

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            default:
                System.out.println("Ingrese el número de operación que desea realizar.");
        }

    }
}