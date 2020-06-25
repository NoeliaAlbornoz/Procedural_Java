package app;

import java.util.Scanner;

public class App {

    /*
     * Dado un colegio con N aulas, ingresar para cada aula nombre, año de
     * nacimiento y promedio del alumno. Cada ingreso por aula termina cuando
     * alguien ingresa el nombre "NADIE". Puede haber aulas vacias. Se pide como
     * resultado final, el nombre y nota del promedio mas alto. Cantidad de alumnos
     * que sacaron menos de 4. Cantidad de alumnos que nacieron en un año bisiesto.
     * para el corte del while, usar: !nombre.equals("NADIE")
     */

    public static Scanner Teclado = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws Exception {

        int contador = 0; // cuenta alumnos con menos de 4
        int contador2 = 0; // cuenta alumnos nacidos en año bisiesto
        int cantidadAulas;
        int año;
        int promedio = 0;
        int maximoPromedio = 0;
        String nombre;
        String mejorAlumno = ""; // la inicializo en vacio
        int numeroAula = 0;

        imprimirBannerCabecera();

        System.out.println("Ingrese la cantidad total de aulas");
        cantidadAulas = Teclado.nextInt();

        for (int i = 0; i < cantidadAulas; i++) {

            imprimirBannerAula();

            numeroAula = Teclado.nextInt();
            Teclado.nextLine();

            nombre = preguntarNombreAlumno();

            while (!esUnNadie(nombre)) {
                System.out.println("Ingrese el año de nacimiento");
                año = Teclado.nextInt();

                System.out.println("Ingrese el promedio del alumno");
                promedio = Teclado.nextInt();
                Teclado.nextLine();

                if (promedio > maximoPromedio) {
                    maximoPromedio = promedio;
                    mejorAlumno = nombre;
                }

                if (esPromedioBajo(promedio))
                    contador++;

                if (esBisiesto(año))
                    contador2++;

                nombre = preguntarNombreAlumno();

            }

        }

        System.out.println("El alumno con el promedio mas alto es " + mejorAlumno + " con una calificacion de "
                + maximoPromedio + " puntos");

        System.out.println("La cantidad de alumnos que saco menos de 4 es " + contador);

        System.out.println("La cantidad de alumnos nacidos en año bisiesto es " + contador2);

    }

    public static boolean esBisiesto(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0)
            return true;
        return false;
    }

    public static boolean esBisiestoV2(int anio) {

        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static void imprimirBannerCabecera() {

        System.out.println(ANSI_RED + "**************************************" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "======================================");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Bienvenido al sistema de promedios");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("======================================");
        System.out.println("**************************************" + ANSI_RESET);

    }

    public static void imprimirBannerAula() {
        System.out.println("**************************************");
        System.out.println("Ingrese el numero del aula");
        System.out.println("**************************************");
    }

    public static void imprimirLeyendaNombreAlumno() {
        System.out.println("Ingrese el nombre del alumno. Para finalizar ingrese NADIE");
        System.out.println("****IMPORTANTE: EN MAYUSCULA ********");
        System.out.println("****!!!!!!!!!!!!!!!!!!!!!!!!!********");
    }

    public static String preguntarNombreAlumno() {
        imprimirLeyendaNombreAlumno();
        String nombre;
        nombre = Teclado.nextLine();

        return nombre;
    }

    public static boolean esUnNadie(String nombre) {
        return nombre.equalsIgnoreCase("NADIE");
    }

    public static boolean esPromedioBajo(int prom) {
        return prom < 9;
    }

}
