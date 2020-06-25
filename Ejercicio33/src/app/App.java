package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-33: Dada la fracción P/Q, para P y Q naturales informar la mayor
         * cantidad de simplificaciones. Desarrolle y utilice una función que reciba dos
         * números naturales y retorne el menor factor común. Ej: 360/60 = 180/30 =
         * 90/15 = 30/5 = 6/1
         */

        double numeroP, numeroQ;
        int cantidad = 0;
        int numero = 2;

        numeroP = ingresarNumeroP();

        numeroQ = ingresarNumeroQ();

        while (numeroP != 1 && numeroQ != 1 && (!(numeroPrimo(numeroP) && numeroPrimo(numeroQ)))) {

            if (calcularMFC(numeroP, numeroQ, numero)) {
                numeroP = numeroP / numero;
                numeroQ = numeroQ / numero;
                cantidad++;
            } else {
                numero++;
            }

        }

        resultado(cantidad);

    }

    public static double ingresarNumeroP() {

        double numeroP;

        System.out.println("Ingresar un número P: ");
        numeroP = Teclado.nextDouble();

        return numeroP;

    }

    public static double ingresarNumeroQ() {

        double numeroQ;

        System.out.println("Ingresar un número Q: ");
        numeroQ = Teclado.nextDouble();

        return numeroQ;

    }

    public static boolean calcularMFC(double numeroP, double numeroQ, int numero) {

        return (numeroP % numero == 0) && (numeroQ % numero == 0);

    }

    public static boolean numeroPrimo(double numeroCualquiera){

        int cont = 0;

        for(int i = 1; i <= numeroCualquiera; i++){
            cont = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cont++;
                }
            }
        }

        return cont == 2;

    }

    public static void resultado(int cantidad) {

        System.out.println("Mayor cantidad de simplificaciones: " + cantidad);

    }
}