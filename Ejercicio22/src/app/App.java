package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-22. Dado un conjunto de valores, que finaliza con un valor nulo,
         * determinar e imprimir (si hubo valores): a) El valor máximo negativo b) El
         * valor mínimo positivo c) El valor mínimo dentro del rango -17.3 y 26.9 d) El
         * promedio de todos los valores.
         */

        double numero;
        double maximoNegativo = -10000000;
        double minimoPositivo = 1000000;
        double minimoRango = 0;
        double promedio = 0;
        double suma = 0;
        int contador = 0;

        System.out.println("Ingresar número: ");
        numero = Teclado.nextDouble();

        while (numero != 0) {

            contador++;
            suma += numero;

            if (numero > 0) {
                if (numero < minimoPositivo) {
                    minimoPositivo = numero;
                }

            } else if (numero > maximoNegativo) {
                maximoNegativo = numero;
            }

            if ((numero >= -17.3) && (numero <= 26.9)) {
                if(contador == 1){
                    minimoRango = numero;
                } else if (numero < minimoRango) {
                    minimoRango = numero;
                }
            }

            System.out.println("Ingresar número: ");
            numero = Teclado.nextDouble();

        }

        if (contador != 0)

        {
            promedio = suma / contador;
            System.out.println("Máximo negativo: " + maximoNegativo);
            System.out.println("Mínimo positivo: " + minimoPositivo);
            System.out.println("Mínimo valor dentro del rango -17.3 y 26.9: " + minimoRango);
            System.out.println("Promedio: " + promedio);
        }

    }
}