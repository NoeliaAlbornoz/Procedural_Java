package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-21: Dado un conjunto de Nombres y Fechas de nacimientos (AAAAMMDD),
         * que finaliza con un Nombre = ‘FIN’, informar el nombre de la persona con
         * mayor edad y el de la más joven.
         */

        String nombre;
        String nombreMayor = "";
        String nombreMenor = "";
        int edad;
        int mayor = 0;
        int menor = 0;

        System.out.println("Nombre: ");
        nombre = Teclado.nextLine();

        while (nombre.compareTo("FIN") != 0) {

            System.out.println("Edad (AAAAMMDD): ");
            edad = Teclado.nextInt();

            if(menor == 0){
                menor = edad;
                nombreMenor = nombre;
            }

            if (edad > mayor) {
                mayor = edad;
                nombreMayor = nombre;
            } else if (edad < menor) {
                nombreMenor = nombre;
            }

            Teclado.nextLine();

            System.out.println("Nombre: ");
            nombre = Teclado.nextLine();

        }

        System.out.println("Nombre de la persona con mayor edad: " + nombreMayor);
        System.out.println("Nombre de la persona más joven: " + nombreMenor);

    }
}