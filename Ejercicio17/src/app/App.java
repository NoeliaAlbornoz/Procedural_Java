package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-17: Dado un valor M determinar y emitir un listado con los M primeros
         * múltiplos de 3 que no lo sean de 5, dentro del conjunto de los números
         * naturales.
         */

         // 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        // 3, 6, 9 12 18 => hay 5 numeros.
        // M =5 => 3, 6,9,12,18

        int cantidadMultiplos;
        int contador = 0;
        int numero = 0;

        System.out.println("Ingrese un valor: ");
        cantidadMultiplos = Teclado.nextInt();

        while (contador < cantidadMultiplos) {

            //numero++;
            numero += 3;

            //numero % 3 == 0 && numero % 5 != 0;
            if (numero % 5 != 0) {
                System.out.println(numero);
                contador++;
            }

        }
    
        System.out.println(" son los primeros " + cantidadMultiplos + " múltiplos de 3 pero no de 5, dentro de los nros. naturales.");

    }
}
