package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-42: Un buque de carga traslada 100 contenedores a tres diferentes
         * puertos del país. Los puertos se identifican con los números 1, 2 y 3. De
         * cada contenedor que el buque traslade se registran los siguientes datos: -
         * Identificación del contenedor - Peso del contenedor en kg - Puerto de arribo
         * (un valor de 1 a 3). El ingreso de datos finaliza con la identificación de un
         * contenedor igual a cero. Se pide calcular e informar: 1) El peso total que el
         * buque debe trasladar 2) La identificación del contenedor de mayor peso 3) La
         * cantidad de contenedores que debe trasladar a cada puerto.
         */

        int puerto, identificacion;
        double peso;
        double pesoTotal = 0;
        double mayorPeso = 0;
        int identificacionMax = 0;
        int contarPuerto1 = 0;
        int contarPuerto2 = 0;
        int contarPuerto3 = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Contenedor Nro. " + (i + 1));

            identificacion = ingresarIdentificacion();

            peso = ingresarPeso();

            do {

                puerto = ingresarPuerto();

                switch (puerto) {
                    case 1:
                        contarPuerto1++;
                        break;
                    case 2:
                        contarPuerto2++;
                        break;
                    case 3:
                        contarPuerto3++;
                        break;
                    default:
                        System.out.println("El puerto ingresado no existe. Vuelva a intentar.");
                }

            } while (!(puerto >= 1 && puerto <= 3));

            pesoTotal = pesoTotal += peso;

            if (peso > mayorPeso) {
                mayorPeso = peso;
                identificacionMax = identificacion;
            }

        }

        imprimirTotales(pesoTotal, identificacionMax, contarPuerto1, contarPuerto2, contarPuerto3);

    }

    public static int ingresarIdentificacion() {

        int identificacion;

        System.out.println("Identificacion: ");
        identificacion = Teclado.nextInt();

        return identificacion;

    }

    public static double ingresarPeso() {

        double peso;

        System.out.println("Peso en kg: ");
        peso = Teclado.nextDouble();

        return peso;

    }

    public static int ingresarPuerto() {

        int puerto;

        System.out.println("Puerto de arribo: ");
        puerto = Teclado.nextInt();

        return puerto;

    }

    public static void imprimirTotales(double pesoTotal, int identificacionMax, int contarPuerto1, int contarPuerto2,
            int contarPuerto3) {

        System.out.println("El peso total es: " + pesoTotal);
        System.out.println("La identificación del contenedor de mayor peso es: " + identificacionMax);
        System.out.println("La cantidad de contenedores que debe trasladar al puerto 1 es: " + contarPuerto1);
        System.out.println("La cantidad de contenedores que debe trasladar al puerto 2 es: " + contarPuerto2);
        System.out.println("La cantidad de contenedores que debe trasladar al puerto 3 es: " + contarPuerto3);

    }

}
