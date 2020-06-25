package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-31: Desarrollar una función tal que dado un número entero positivo
         * calcule y retorne su factorial.
         * 
         * Factorial: La función factorial se representa con un signo de exclamación “!”
         * detrás de un número. Esta exclamación quiere decir que hay que multiplicar
         * todos los números enteros positivos que hay entre ese número y el 1.
         * 
         * Ejemplo: 6! = 1*2*3*4*5*6 = 720. A este número, 6! le llamamos generalmente
         * “6 factorial”, aunque también es correcto decir “factorial de 6”.
         * 
         * En tu calculadora podrás ver una tecla con “n!” o “x!”. Esta tecla te servirá
         * para calcular directamente el factorial del número que quieras.
         */

        int numero, factorial;

        numero = ingresarNumero();
        factorial = calcularFactorial(numero);
        resultado(numero, factorial);

    }

    public static int ingresarNumero() {

        int numero;

        System.out.println("Ingresar número: ");
        numero = Teclado.nextInt();

        return numero;

    }

    public static int calcularFactorial(int numero){

        int multiplicacion = 1;

        for(int i = 1; i <= numero; i++){

            multiplicacion *= i;
        }

        return multiplicacion;

    }

    public static void resultado(int numero, int factorial){

        System.out.println("El factorial de " + numero + " es " + factorial);

    }
}