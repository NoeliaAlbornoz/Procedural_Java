package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * En una región se procesan las temperaturas de los últimos 12 meses, indicar
         * cuál fue la máxima y el mes.
         */

        double temperatura;
        int mes;
        double maxima = 0;
        int mesMax = 0;

        for (int i = 0; i < 12; i++) {

            System.out.println("Ingresar temperatura: ");
            temperatura = Teclado.nextDouble();

            System.out.println("Ingresar mes (en números): ");
            mes = Teclado.nextInt();

            if(i == 0){
                maxima = temperatura;
                mesMax = mes;
            } else if (temperatura > maxima) {
                maxima = temperatura;
                mesMax = mes;
            }

        }

        System.out.println("La temperatura máxima fue de: " + maxima + " grados, y corresponde al mes " + mesMax);
    }
}