package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-34. Diseñar un procedimiento que imprima el cartel: PRESIONE ENTER
         * PARA CONTINUAR
         */

         String nombre;

         enter();
         Teclado.nextLine();
         System.out.print("Nombre: ");
         nombre = Teclado.nextLine();
         enter();
         Teclado.nextLine();
         System.out.println("FIN");

    }

    public static void enter(){
        System.out.println("Presione ENTER para continuar");
    }
}