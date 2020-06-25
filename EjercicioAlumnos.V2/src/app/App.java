/* Dado un colegio con N aulas, ingresar para cada aula nombre, año de
* nacimiento y promedio del alumno. Cada ingreso por aula termina cuando
* alguien ingresa el nombre "NADIE". Puede haber aulas vacias. Se pide como
* resultado final, el nombre y nota del promedio mas alto. Cantidad de alumnos
* que sacaron menos de 4. Cantidad de alumnos que nacieron en un año bisiesto.
* para el corte del while, usar: !nombre.equals("NADIE")
*/

package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int contador = 0; // cuenta alumnos con menos de 4
        int contador2 = 0; // cuenta alumnos nacidos en año bisiesto
        int cantidadAulas;
        int año;
        int promedio = 0;
        int maximoPromedio = 0;
        String nombre;
        String mejorAlumno = ""; // la inicializo en vacio
        int numeroAula;

        System.out.println("Ingrese la cantidad total de aulas");
        cantidadAulas = Teclado.nextInt();

        for (int i = 0; i < cantidadAulas; i++) {

            System.out.println("Ingrese el numero del aula");
            numeroAula = Teclado.nextInt();
            Teclado.nextLine();

            System.out.println("Ingrese el nombre del alumno. Para finalizar ingrese NADIE");
            nombre = Teclado.nextLine();

            while (!nombre.equals("NADIE")) {
                System.out.println("Ingrese el año de nacimiento");
                año = Teclado.nextInt();

                System.out.println("Ingrese el promedio del alumno");
                promedio = Teclado.nextInt();
                Teclado.nextLine();

                if (promedio > maximoPromedio) {
                    maximoPromedio = promedio;
                    mejorAlumno = nombre;
                }

                if (promedio < 4)
                    contador++;

                if (esBisiesto(año)) {
                    contador2++;

                System.out.println("Ingrese el nombre del alumno. Para finalizar ingrese NADIE");
                nombre = Teclado.nextLine();

            }

        }

        System.out.println("El alumno con el promedio mas alto es " + mejorAlumno + " con una calificacion de "
                + maximoPromedio + " puntos");

        System.out.println("La cantidad de alumnos que saco menos de 4 es " + contador);

        System.out.println("La cantidad de alumnos nacidos en año bisiesto es " + contador2);
    }
}


    public static boolean esBisiesto(int anio) {

        if (anio % 4 == 0 && anio % 100 != 0) {
            return true;
        } else if (anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esBisiestoV2(int anio) {

        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

    }
}
