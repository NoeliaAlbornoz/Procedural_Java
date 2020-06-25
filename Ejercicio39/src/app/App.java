package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-39: Una bodega quiere lanzar una oferta para terminar con el stock de
         * dos productos. Para ello cuenta con B cantidad de cajas de vino blanco y T
         * cantidad de cajas de vino tinto. Desea armar la mayor cantidad posible de
         * paquetes con la oferta y que todos los paquetes tengan igual cantidad de
         * cajas de vino blanco y de vino tinto.
         * 
         * Se pide informar cuántos paquetes se podrán armar como máximo, y cuántas
         * cajas de vino blanco y cuantas de vino tinto contendrán cada uno. Utilice la
         * función desarrollada en el Ej. MI-30.
         */

        int T, B, R, cajas;
        int MCD = 0;

        T = ingresarTintos();
        B = ingresarBlancos();

        do {

            R = calcularMCD(T, B);

            if (R == 0) {
                MCD = B;
                cajas = T / B;
                resultado(MCD, cajas);
            } else {
                T = B;
                B = R;
            }

        } while (R != 0);

    }

    public static int ingresarTintos() {

        int T;

        System.out.println("Ingresar cantidad de cajas de vino tinto: ");
        T = Teclado.nextInt();

        return T;

    }

    public static int ingresarBlancos() {

        int B;

        System.out.println("Ingresar cantidad de cajas de vino blanco: ");
        B = Teclado.nextInt();

        return B;

    }

    public static int calcularMCD(int T, int B) {

        return T % B;

    }

    public static void resultado(int MCD, int cajas) {

        System.out.println("Cantidad máxima de paquetes: " + MCD);
        System.out.println("Cantidad de cajas de vino tinto en cada paquete: " + cajas);
        System.out.println("Cantidad de cajas de vino blanco en cada paquete: " + cajas);

    }
}
