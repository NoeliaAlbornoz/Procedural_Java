package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-44: Se realiza una inspección en una fábrica de pinturas, y se
         * detectaron algunas infracciones: De cada infracción se tomó nota de los
         * siguientes datos: - Tipo de Infracción (1, 2, 3, ó 4) - Motivo de la
         * infracción - Valor de la multa - Gravedad de la infracción (‘L’,‘M’, ‘G’).
         * Los datos finalizan con tipo de infracción igual a cero. Se pide: Informar al
         * final del proceso:  Los valores totales de la multa a pagar de acuerdo al
         * tipo de gravedad.  La leyenda “Clausurar fábrica” si la cantidad de
         * infracciones 3 y 4 con gravedad “G” sean mayor a 3.  Cuál fue el motivo que
         * corresponde a la infracción de menor valor.
         */

        int tipo;
        String motivo;
        double multa;
        char gravedad;
        int i = 1;
        double multasL = 0;
        double multasM = 0;
        double multasG = 0;
        int contarInfr3y4 = 0;
        double multaMin = 0;
        String motivoMin = "";

        numeroInfraccion(i);
        tipo = ingresoTipoInfraccion();

        while (tipo != 0) {

            Teclado.nextLine();

            motivo = ingresoMotivoinfraccion();

            multa = ingresoMulta();

            if (i == 1) {
                multaMin = multa;

            } else if (multa < multaMin) {
                multaMin = multa;
                motivoMin = motivo;
            }

            Teclado.nextLine();

            gravedad = ingresoGravedad();

            switch (gravedad) {
                case 'L':
                    multasL += multa;
                    break;
                case 'M':
                    multasM += multa;
                    break;
                case 'G':
                    multasG += multa;

                    if (tipo == 3 || tipo == 4) {
                        contarInfr3y4++;
                    }

                    break;

            }

            i++;

            numeroInfraccion(i);
            tipo = ingresoTipoInfraccion();

        }

        imprimirResultados(contarInfr3y4, multasL, multasM, multasG, motivoMin);

    }

    public static void numeroInfraccion(int i) {
        System.out.println("Infracción Nro. " + i);
    }

    public static int ingresoTipoInfraccion() {
        int tipo;

        System.out.print("Tipo: ");
        tipo = Teclado.nextInt();

        return tipo;
    }

    public static String ingresoMotivoinfraccion() {
        String motivo;

        System.out.print("Motivo: ");
        motivo = Teclado.nextLine();

        return motivo;
    }

    public static double ingresoMulta() {
        double multa;

        System.out.print("Multa: ");
        multa = Teclado.nextDouble();

        return multa;
    }

    public static char ingresoGravedad() {
        char gravedad;

        System.out.print("Gravedad: ");
        gravedad = Teclado.nextLine().charAt(0);

        return gravedad;
    }

    public static void imprimirResultados(int contarInfr3y4, double multasL, double multasM, double multasG,
            String motivoMin) {

        if (contarInfr3y4 > 3) {
            System.out.println("Clausurar fábrica");
        }

        System.out.println("Totales multas de gravedad L: " + multasL);
        System.out.println("Totales multas de gravedad M: " + multasM);
        System.out.println("Totales multas de gravedad G: " + multasG);
        System.out.println("Motivo de la infracción de menor valor: " + motivoMin);

    }
}