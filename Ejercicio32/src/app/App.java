package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-32: Dada una serie de números enteros, informar: a) su factorial, b)
         * cuantos múltiplos de 3, c) cuantos múltiplos de 5, d) cuantos múltiplos de 3 y
         * de 5. Utilice las funciones de ejercicios anteriores.
         */

        int serie, numero;
        int factorial = 1;
        int contarMultiploTres = 0;
        int contarMultiploCinco = 0;
        int contarMultiploAmbos = 0;

        serie = ingresarSerie();

        for (int i = 0; i < serie; i++) {

            numero = ingresarNumero();

            factorial *= numero;

            if (multiploTres(numero))
                contarMultiploTres++;

            if (multiploCinco(numero))
                contarMultiploCinco++;

            if (multiploAmbos(numero))
                contarMultiploAmbos++;

        }

        resultados(factorial, contarMultiploTres, contarMultiploCinco, contarMultiploAmbos);

    }

    public static int ingresarSerie() {

        int serie;

        System.out.println("Ingresar cantidad de números de la serie: ");
        serie = Teclado.nextInt();

        return serie;
    }

    public static int ingresarNumero() {

        int numero;

        System.out.println("Ingresar número entero: ");
        numero = Teclado.nextInt();

        return numero;
    }

    public static boolean multiploTres(int numero) {

        return numero % 3 == 0;

    }

    public static boolean multiploCinco(int numero) {

        return numero % 5 == 0;

    }

    public static boolean multiploAmbos(int numero) {

        return numero % 15 == 0;

    }

    public static void resultados(int factorial, int contarMultiploTres, int contarMultiploCinco,
            int contarMultiploAmbos) {

        System.out.println("Factorial: " + factorial);
        System.out.println("Cantidad de múltiplos de 3: " + contarMultiploTres);
        System.out.println("Cantidad de múltiplos de 5: " + contarMultiploCinco);
        System.out.println("Cantidad de múltiplos de 3 y de 5: " + contarMultiploAmbos);

    }

}