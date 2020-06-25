package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-41: De un censo realizado en una población se conocen los siguientes
         * datos: - Día de nacimiento (2 dig.) - Mes (2 dig.) - Año (4 dig.) - Sexo
         * ('M'=masc. 'F'=fem., ‘O=Otro’) Con estos datos de cada habitante se forma un
         * lote finalizado con un día cero. Desarrollar el programa que determine e
         * imprima: 1) Cuántos nacimientos hubo en el mes de octubre de todos los años.
         * 2) Cuántos nacimientos hubo antes del 9 de julio de 1990. 3) Cuántos
         * nacimientos de mujeres hubo en la primavera del 1982. 4) Sexo de la persona
         * más vieja (solo existe una).
         */

        int dia, mes, año;
        char sexo;
        int i = 1;
        int contarOctubre = 0;
        int contarNacimientos = 0;
        int contarFem = 0;
        char sexoMasVieja = ' ';
        int nacimientoMasViejo = 0;

        bannerTematica();

        nroPersona(i);

        dia = IngresoDia();

        while (dia != 0) {

            mes = IngresoMes();
            año = IngresoAño();

            if (mes == 10) {
                contarOctubre++;
            }

            if (transformacionNacimiento(dia, mes, año) <= 19900709) {
                contarNacimientos++;
            }

            Teclado.nextLine();

            sexo = IngresoSexo();

            if (primavera(año, dia, mes)) {

                contarFem++;

            }

            if (i == 1) {
                nacimientoMasViejo = transformacionNacimiento(dia, mes, año);
                sexoMasVieja = sexo;

            } else if (transformacionNacimiento(dia, mes, año) < nacimientoMasViejo) {
                nacimientoMasViejo = transformacionNacimiento(dia, mes, año);
                sexoMasVieja = sexo;
            }

            i++;

            nroPersona(i);

            dia = IngresoDia();

        }

        resultados(contarOctubre, contarNacimientos, contarFem, sexoMasVieja);

    }

    public static void bannerTematica() {

        System.out.println("Datos del censo");

    }

    public static void nroPersona(int i) {
        System.out.println("Persona: " + i);

    }

    public static int IngresoDia() {
        int dia;
        System.out.print("Día: ");
        dia = Teclado.nextInt();
        return dia;

    }

    public static int IngresoMes() {
        int mes;
        System.out.print("Mes: ");
        mes = Teclado.nextInt();
        return mes;

    }

    public static int IngresoAño() {
        int año;
        System.out.print("Año: ");
        año = Teclado.nextInt();
        return año;

    }

    public static char IngresoSexo() {
        char sexo;
        System.out.print("Sexo: ");
        sexo = Teclado.nextLine().charAt(0);
        return sexo;

    }

    public static int transformacionNacimiento(int dia, int mes, int año) {

        return año * 10000 + mes * 100 + dia;

    }

    public static boolean primavera(int año, int dia, int mes) {

        return año == 1982 && ((dia >= 21 && mes == 9) || mes == 10 || mes == 11 || (dia <= 21 && mes == 12));

    }

    public static void resultados(int contarOctubre, int contarNacimientos, int contarFem, char sexoMasVieja) {
        System.out.println("Cantidad de nacimientos en Octubre: " + contarOctubre);
        System.out.println("Cantidad de nacimientos antes del 9 de Julio de 1990: " + contarNacimientos);
        System.out.println("Cantidad de nacimientos de mujeres en la primavera de 1982: " + contarFem);
        System.out.println("Sexo de la persona más vieja: " + sexoMasVieja);
    }
}