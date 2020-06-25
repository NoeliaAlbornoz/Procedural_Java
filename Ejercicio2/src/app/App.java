package app;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-2 Dado el siguiente enunciado y su representación gráfica especifique
         * los datos de entrada, de salida y estrategia. Enunciado: Dado un número real
         * que representa el importe de una compra informar las posibles formas de pago,
         * según la siguiente tabla: 1 cuota de $................. 2 cuotas de
         * $................. total $................. ( 5% de recargo) 6 cuotas de
         * $................. total $................. ( 40% de recargo)
         */

        // Importe ingresado
        double importe;
        // Total en 2 cuotas con recargo 5%
        double total2Cuotas;
        // Cuota a pagar en 2 veces
        double cuotaEn2Pagos;
        double total6Cuotas, cuotasEn6Pagos;

        System.out.println("Ingrese el importe total: ");
        importe = Teclado.nextDouble();

        total2Cuotas = importe * 5 / 100 + importe; // esto es una expresion
        // de izquierda a derecha, se ejecuta primero la multiplicacion por la
        // precedencia:
        // total2Cuotas = (importe * 5) / 100 + importe, luego
        // total2Cuotas = ((importe * 5) / 100 )+ importe, por ultimo
        // total2Cuotas = (((importe * 5) / 100 )+ importe)
        // otra forma: total2Cuotas = importe * 1.05;

        cuotaEn2Pagos = total2Cuotas / 2;

        total6Cuotas = importe * 1.40;

        cuotasEn6Pagos = total6Cuotas / 6;

        System.out.println("1 cuota de $" + importe);
        System.out.println("2 cuotas de $" + cuotaEn2Pagos + " total $" + total2Cuotas);
        System.out.println("6 cuotas de $" + cuotasEn6Pagos + " total $" + total6Cuotas);

        System.out.format("6 cuotas de $%.2f", cuotasEn6Pagos);
        System.out.format(" total $%.2f", total6Cuotas);

    }
}