package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-29: Una compañía aérea desea emitir un listado con los movimientos
         * mensuales de sus M vuelos al exterior. Para ello cuenta con la siguiente
         * información. De cada vuelo realizado el número de vuelo, destino, y cantidad
         * de asientos. De cada pasajero el número de pasaporte y el importe que abonó
         * por el pasaje en dólares. La información finaliza con un número de pasaporte
         * igual a cero. Se pide emitir el siguiente listado:
         * 
         * Nro. de Vuelo 9999 Destino: xxxxxxxxxxxxxxxxx Nro. de Pasaporte Importe en
         * u$s 99999999 999.99 99999999 999.99 Total recaudado del vuelo: 99999.99 % de
         * Asientos Libres del vuelo 999.99 % de Asientos Ocupados del vuelo 999.99
         * Total recaudado en el mes 999999.99 Cantidad de veces seguidas que se dieron
         * vuelos completos 99 El número de vuelo que más recaudó 9999
         */

        int cantidadVuelos, pasaporte, asientos;
        String destino;
        double importe;
        double importeMax = 0;
        double totalImporteVuelo = 0;
        double totalImporteMes = 0;
        int contarPasaporte = 0;
        int porcentajeLibres = 0;
        int porcentajeOcupados = 0;
        int numeroVueloMax = 0;
        int contarCompletos = -1;
        int consecutivos = 0;

        System.out.print("Ingresar la cantidad de vuelos del mes: ");
        cantidadVuelos = Teclado.nextInt();

        for (int i = 0; i < cantidadVuelos; i++) {

            System.out.println("Nro. de Vuelo: " + (i + 1));
            Teclado.nextLine();
            System.out.print("Destino: ");
            destino = Teclado.nextLine();
            System.out.print("Cantidad de asientos: ");
            asientos = Teclado.nextInt();

            System.out.print("Pasaporte Nro.: ");
            pasaporte = Teclado.nextInt();

            while (pasaporte > 0) {

                contarPasaporte++;

                System.out.print("Importe $");
                importe = Teclado.nextDouble();

                totalImporteVuelo += importe;

                System.out.print("Pasaporte Nro.: ");
                pasaporte = Teclado.nextInt();

            }

            totalImporteMes += totalImporteVuelo;

            if (totalImporteVuelo > importeMax) {
                importeMax = totalImporteVuelo;
                numeroVueloMax = (i + 1);
            }

            porcentajeOcupados = (contarPasaporte * 100) / asientos;
            porcentajeLibres = 100 - porcentajeOcupados;

            if(porcentajeLibres == 0){
                contarCompletos++;
                if(contarCompletos != 0){
                    consecutivos = contarCompletos;
                }
            } else {
                contarCompletos = -1;
            }

            System.out.println("Total recaudado del vuelo $" + totalImporteVuelo);
            System.out.println("Asientos libres: " + porcentajeLibres + "%");
            System.out.println("Asientos ocupados: " + porcentajeOcupados + "%");

            totalImporteVuelo = 0;
            contarPasaporte = 0;

        }

        if(contarCompletos == -1){
            contarCompletos = 0;
        }

        System.out.println(".............................................");

        System.out.println("Total recaudado en el mes $" + totalImporteMes);
        System.out.println("Cantidad de veces seguidas que se dieron vuelos completos: " + consecutivos);
        System.out.println("Mayor recaudación: Vuelo Nro. " + numeroVueloMax);
    }
}