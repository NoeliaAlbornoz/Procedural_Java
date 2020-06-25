package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Dado un colegio con N aulas, ingresar para cada aula nombre, año de
         * nacimiento y promedio del alumno. Cada ingreso por aula termina cuando
         * alguien ingresa el nombre "NADIE". Puede haber aulas vacias. Se pide como
         * resultado final, el nombre y nota del promedio mas alto. Cantidad de alumnos
         * que sacaron menos de 4. Cantidad de alumnos que nacieron en un año bisiesto.
         * Para el corte del while, usar: nombre.equals("NADIE").
         */

        int aulas;
        String nombre;
        int nacimiento;
        double promedio;
        String nombrePromMax = "";
        double promedioMax = 0;
        int contarProm = 0;
        int contarBisiesto = 0;

        System.out.println("Número de aulas: ");
        aulas = Teclado.nextInt();

        Teclado.nextLine();

        for (int i = 0; i < aulas; i++) {

            System.out.println("Aula Nro.: " + (i + 1));

            System.out.println("Nombre: ");
            nombre = Teclado.nextLine();

            while (!(nombre.equals("NADIE"))) {

                System.out.println("Nacimiento: ");
                nacimiento = Teclado.nextInt();

                System.out.println("Promedio: ");
                promedio = Teclado.nextDouble();

                Teclado.nextLine();

                if (promedio > promedioMax) {
                    promedioMax = promedio;
                    nombrePromMax = nombre;
                }

                if (promedio < 4) {
                    contarProm++;
                }

                if (nacimiento % 4 == 0 && nacimiento % 100 != 0) {
                    contarBisiesto++;
                } else if (nacimiento % 400 == 0) {
                    contarBisiesto++;
                }

                System.out.println("Nombre: ");
                nombre = Teclado.nextLine();

            }

        }

        System.out.println("Promedio más alto: " + nombrePromMax + " " + promedioMax);
        System.out.println("Cantidad de alumnos con promedio menor a 4: " + contarProm);
        System.out.println("Cantidad de alumnos nacidos en año bisiesto: " + contarBisiesto);

    }

}