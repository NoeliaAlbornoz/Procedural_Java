package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-23: Se dispone de un lote de valores enteros positivos que finaliza
         * con un número negativo. El lote está dividido en sublotes por medio de
         * valores cero. Desarrollar un programa que determine e informe: a) por cada
         * sublote el promedio de valores b) el total de sublotes procesados c) el valor
         * máximo del conjunto, indicando en qué sublote se encontró y la posición
         * relativa del mismo dentro del sublote d) valor mínimo de cada sublote Nota:
         * el lote puede estar vacío (primer valor negativo), o puede haber uno, varios
         * o todos los sublotes vacíos (ceros consecutivos).
         */

        double numero;
        double suma = 0;
        double promedio = 0;
        int contarSublote = 0;
        int contarPosicion = 0;
        double maximo = 0;
        int subloteMax = 0;
        int posicionMax = 0;
        double minimo = 0;

        System.out.println("Ingrese numero: ");
        numero = Teclado.nextInt();

        while (numero >= 0) {

            if (numero != 0) {
                suma += numero;
                contarPosicion++;

                if(numero > maximo){
                    maximo = numero;
                    posicionMax = contarPosicion;
                    subloteMax = contarSublote;
                }
                
                if(contarPosicion == 1){
                    minimo = numero;
                } else if(numero < minimo){
                    minimo = numero;
                }

            } else {
                contarSublote++;

                if (contarPosicion != 0) {
                    promedio = suma / contarPosicion;
                    System.out.println("El promedio de valores del sublote nro. " + contarSublote + " es " + promedio);
                    System.out.println("El valor mínimo de este sublote es " + minimo);
                } else {
                    System.out.println("El sublote nro. " + contarSublote + " está vacío.");
                }

                suma = 0;
                contarPosicion = 0;
            }

            System.out.println("Ingrese numero: ");
            numero = Teclado.nextInt();

        }

        System.out.println("El total de sublotes es " + contarSublote);
        System.out.println("El valor máximo es " + maximo + " encontrado en el sublote " + (subloteMax + 1) + " en la posición " + posicionMax + " del mismo.");
    }
}