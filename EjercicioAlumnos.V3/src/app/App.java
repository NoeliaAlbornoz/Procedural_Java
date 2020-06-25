package app;

import java.util.Scanner;

public class App {
    public static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        /*
         * Dado un colegio con N aulas, ingresar para cada aula nombre, año de
         * nacimiento y promedio del alumno. Cada ingreso por aula termina cuando
         * alguien ingresa el nombre "NADIE". Puede haber aulas vacias. Se pide como
         * resultado final, el nombre y nota del promedio mas alto. Cantidad de alumnos
         * que sacaron menos de 4. Cantidad de alumnos que nacieron en un año bisiesto.
         * para el corte del while, usar: nombre.equals("NADIE")
         */

        int n; // cantidad de aulas
        int contador1 = 0; // cantidad de alumnos que sacaron -4
        int contador2 = 0; // cantidad de alumnos que nacieron es año bisiesto
        double promedio;
        double max = 1.0;
        String nombre;
        String nombreMax = "";
        int anioNac;
        int i = 0;

        System.out.println("Ingrese cantidad de aulas");
        n = Entrada.nextInt();
        Entrada.nextLine();

        do {
            System.out.println("Ingrese nombre del alumno");
            nombre = Entrada.nextLine();

            if (!(nombre.equalsIgnoreCase("NADIE"))) {
                System.out.println("Ingrese año de nacimiento");
                anioNac = Entrada.nextInt();

                if (anioNac % 4 == 0 && anioNac % 100 != 0) {
                    contador2++;
                } else if (anioNac % 400 == 0) {
                    contador2++;
                }

                System.out.println("Ingrese promedio del alumno");
                promedio = Entrada.nextDouble();
                Entrada.nextLine();

                if (max < promedio) {
                    max = promedio;
                    nombreMax = nombre;
                }

                if (promedio < 4) {
                    contador1++;
                }

                if (anioNac % 4 == 0 && anioNac % 100 != 0) {
                    contador2++;
                } else if (anioNac % 400 == 0) {
                    contador2++;
                }

            } else {
                i++;
                System.out.println("Aca termino su clase N:" + i);
            }

        } while ((!nombre.equalsIgnoreCase("NADIE")) || i != n);

        System.out.println("El promedio mas alto es: " + max);
        System.out.println("Y le corresponde al alumno:" + nombreMax);
        System.out.println("La cantidad de alumnos que sacaron menos de 4 es:" + contador1);
        System.out.println("La cantidad de alumnos que nacieron en un año bisiesto es:" + contador2);
    }
}