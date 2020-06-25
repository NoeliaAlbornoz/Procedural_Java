package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-28: El gobierno de la Ciudad de Buenos Aires realiza una encuesta en
         * casas de familia. De cada familia conoce: domicilio, tipo de vivienda
         * (‘C’:casa, ‘D’:departamento), y cantidad de integrantes. De cada integrante
         * de la familia se conoce: nombre y apellido, edad, sexo (‘F’, ‘M’, ’O’), nivel
         * de estudios alcanzados (‘N’: no posee, ‘P’: primario, ‘S’: secundario, ‘T’:
         * terciario, ‘U’: universitario), y un indicador (‘I’: incompleto, ‘C’:
         * completo) que se refiere al ítem anterior. Los datos finalizan cuando la
         * cantidad de integrantes sea igual a cero. Se pide emitir un listado con los
         * resultados: a) los datos de los encuestados que hayan completado los estudios
         * primarios b) el porcentaje de analfabetismo en la ciudad (analfabetos:
         * mayores de 10 años que no posean estudios) c) el domicilio de la familia con
         * mayor cantidad de integrantes que viven en departamento d) edad promedio de
         * cada familia y de la ciudad e) cantidad de encuestados en cada tipo de nivel
         * de estudios alcanzados incompletos. f) porcentaje de encuestados de sexo
         * femenino y masculino.
         */

        // el punto a) se hace con una estructura q no vimos todavia

        int cantidadIntegrantes = 0;
        String domicilio, nombre, apellido, tipoVivienda, sexo, nivelEstudio, indicador;
        int edad, edadPromFamilia;
        int edadPromCiudad = 0;
        int contadorFamilias = 1; // inicializo en 1 porq pongo la leyenda fuera de los ciclos
        int contarAnalf = 0;
        int totalCiudadanos = 0;
        int porcentajeAnalfabetismo = 0;
        String domicilioMax = "";
        int sumaEdadFamilia = 0;
        int sumaEdadCiudad = 0;
        int contPrimInc = 0;
        int contSecInc = 0;
        int contTerInc = 0;
        int contUnivInc = 0;
        int porcentajeFem = 0;
        int porcentajeMasc = 0;
        int cantMax = 0;
        int contFem = 0;
        int contMasc = 0;

        System.out.println("Familia Nro. " + contadorFamilias);

        System.out.print("Cantidad de integrantes: ");
        cantidadIntegrantes = Teclado.nextInt();

        while (cantidadIntegrantes != 0) {

            totalCiudadanos += cantidadIntegrantes; // se van acumulando todos los integrantes de todas las familias

            Teclado.nextLine(); // atrapa el enter del nextInt()

            System.out.print("Domicilio: ");
            domicilio = Teclado.nextLine().toUpperCase();

            System.out.print("Tipo de vivienda (‘C’:casa, ‘D’:departamento): ");
            tipoVivienda = Teclado.nextLine().toUpperCase();

            if (tipoVivienda.equalsIgnoreCase("D")) { // valida si vive en depto. y compara para sacar maximo
                if (cantidadIntegrantes > cantMax) {
                    cantMax = cantidadIntegrantes;
                    domicilioMax = domicilio;
                }
            }

            for (int i = 0; i < cantidadIntegrantes; i++) { // lo q esta afuera del for son los datos de cada familia,
                                                            // lo q esta adentro son los datos de cada integrante

                System.out.println("Integrante Nro. " + (i + 1));

                System.out.print("Nombre: ");
                nombre = Teclado.nextLine().toUpperCase();

                System.out.print("Apellido: ");
                apellido = Teclado.nextLine().toUpperCase();

                System.out.print("Edad: ");
                edad = Teclado.nextInt();

                sumaEdadFamilia += edad; // acumulo edades para usarlas en el promedio
                sumaEdadCiudad += edad;

                Teclado.nextLine();

                System.out.print("Sexo (‘F’:femenino, ‘M’:masculino, ’O’:otro): ");
                sexo = Teclado.nextLine().toUpperCase();

                switch (sexo) {
                    case "F":
                        contFem++;
                        break;
                    case "M":
                        contMasc++;
                        break;
                }

                System.out.print(
                        "Nivel de estudio (‘N’:no posee, ‘P’:primario, ‘S’:secundario, ‘T’:terciario, ‘U’:universitario): ");
                nivelEstudio = Teclado.nextLine().toUpperCase();

                if (!(nivelEstudio.equalsIgnoreCase("N"))) { // si el nivel de estudio no es N, entra al if
                    System.out.print("Estado (‘I’:incompleto, ‘C’:completo): ");
                    indicador = Teclado.nextLine().toUpperCase();

                    if (indicador.equalsIgnoreCase("I")) {

                        switch (nivelEstudio) {
                            case "P":
                                contPrimInc++;
                                break;
                            case "S":
                                contSecInc++;
                                break;
                            case "T":
                                contTerInc++;
                                break;
                            case "U":
                                contUnivInc++;
                                break;
                        }
                    }

                } else { // si entro al else quiere decir q puse un nivel de estudio N, y de todos los N
                         // tengo q contar los q tienen una edad menor a 10 años
                    if (edad > 10) {
                        contarAnalf++;
                    }
                }
            }

            edadPromFamilia = sumaEdadFamilia / cantidadIntegrantes; // saco promedio de edad de cada familia 
                                                                     // fuera del for
            System.out.println("Edad promedio de la familia: " + edadPromFamilia);

            sumaEdadFamilia = 0; // reinicio porq la necesito para acumular las edades de los integrantes de la
                                 // proxima familia
            contadorFamilias++;

            System.out.println("Familia Nro. " + contadorFamilias);

            System.out.println("Cantidad de integrantes: ");
            cantidadIntegrantes = Teclado.nextInt();

        }

        // las siguientes operaciones trabajan con los datos acumulados de todas las familias, 
        //por eso las calculo cuando termino de procesarlos a todos (fuera de todos los ciclos)

        porcentajeAnalfabetismo = (contarAnalf * 100) / totalCiudadanos;
        edadPromCiudad = sumaEdadCiudad / totalCiudadanos;
        porcentajeFem = (contFem * 100) / totalCiudadanos;
        porcentajeMasc = (contMasc * 100) / totalCiudadanos;

        System.out.println("Porcentaje de analfabetismo: " + porcentajeAnalfabetismo + "%");
        System.out.println("Domicilio de la familia con la mayor cantidad de integrantes que vive en departamento: "
                + domicilioMax);
        System.out.println("Edad promedio de la ciudad: " + edadPromCiudad);
        System.out.println("Primario incompleto: " + contPrimInc + " encuestados.");
        System.out.println("Secundario incompleto: " + contSecInc + " encuestados.");
        System.out.println("Terciario incompleto: " + contTerInc + " encuestados.");
        System.out.println("Universitario incompleto: " + contUnivInc + " encuestados.");
        System.out.println("Porcentaje sexo femenino: " + porcentajeFem + "%");
        System.out.println("Porcentaje sexo masculino: " + porcentajeMasc + "%");

    }
}