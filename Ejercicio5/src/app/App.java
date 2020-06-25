package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-5 Enunciado: Dados dos valores enteros y distintos, emitir una leyenda
         * apropiada que informe cuál es el mayor entre ellos.
         */

        int numero1, numero2;

        System.out.println("Ingresar el primer numero: ");
        numero1 = Teclado.nextInt();

        System.out.println("Ingresar el segundo numero: ");
        numero2 = Teclado.nextInt();

        if (numero1 > numero2) {

            System.out.println("El numero1 es mayor que el numero2");

        } else if (numero1 == numero2) {

            System.out.println("Los numeros son iguales");

        } else {

            System.out.println("El numero1 es menor que el numero2");

        }

        /*
         * Otra forma
         * 
         * if(numero1 > numero2){ //valor verdadero
         * System.out.println("El numero1 es mayor que el numero2");
         * 
         * } else { //valor falso if(numero1 == numero2){
         * System.out.println("El numero1 es igual que el numero2"); } else{
         * System.out.println("El numero1 es menor que el numero2"); }
         * 
         * }
         */

    }
}