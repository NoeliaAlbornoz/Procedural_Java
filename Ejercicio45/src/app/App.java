package app;

import java.util.Scanner;

public class App {

    public static Scanner Entrada = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        /*
         * Ej. MI-45: Desarrollar: a) Una función que reciba un número natural de 4
         * dígitos en formato de HHMM que corresponde a un tiempo determinado en horas y
         * minutos, retorne ese tiempo en minutos. b) Un procedimiento que reciba el
         * costo en pesos de un abono telefónico, la cantidad de minutos libres que
         * incluye el abono, el cargo en pesos por minuto excedente y la cantidad de
         * minutos utilizados por un abonado, retorne la cantidad de minutos excedidos y
         * el monto en pesos a abonar (costo del abono más minutos excedidos por el
         * costo de minutos excedidos) más el 21% del valor del IVA Desarrolle un
         * algoritmo que resuelva la siguiente situación problemática: Todos los fines
         * de mes, una empresa de telefonía celular debe confeccionar las facturas con
         * los consumos de todos sus abonados, que se realizan en tres turnos de
         * trabajo: Mañana, Tarde y Noche. Para ello se ingresará por teclado la
         * siguiente información de cada celular: - Número de celular 9 dígitos ( 0
         * indica cambio de turno) - Nombre del abonado 20 caracteres - Dirección del
         * abonado 25 caracteres - Tiempo utilizado 4 dígitos en formato HHMM - Tipo de
         * abono (carácter, A, B, C, D o E) Dependiendo del tipo de abono que se tenga,
         * el usuario tiene cierta cantidad de minutos libres, por los cuales no abona
         * cargo extra, pero por cada minuto que se exceda debe abonar una suma extra
         * según la siguiente tabla: Plan A B C D E Costo $70 $55 $40 $28 $19 Minutos
         * Libres 300 200 100 60 40 Cargo por minuto excedente $0.09 $0.15 $0.21 $0.29
         * $0.37 Emitir el siguiente listado por cada turno: Turno Mañana Nombre del
         * Abonado Dirección Minutos libres Minutos Excedidos Monto Total xxxxxxxxxxxx
         * xxxxxxxxx 99999 99999 xxxxxxxxxxxx xxxxxxxxx 99999 99999 xxxxxxxxxxxx
         * xxxxxxxxx 99999 99999 ………………Turno Tarde......Turno Noche......
         * Informar por cada turno de trabajo:  El nombre del abonado que debe abonar la factura más costosa y el
         * monto de ésta.  El nombre y el número de celular de la persona que realizó
         * la mayor cantidad de minutos excedentes, indicando cuántos fueron. Al final
         * del día informar:  El monto total facturado  En que turno y en que orden
         * dentro del turno apareció el abonado que utilizó la menor cantidad de minutos
         * en el mes. Utilice los subprogramas a) y b).
         */

        int celular, tiempo, i, min_utilizados;
        Integer min_excedidos = 0;
        Integer min_libres = 0;
        Double costo = 0D, cargo_extra = 0D, monto = 0D;
        String nombre = "", direccion = "";
        char tipo;
        for (i = 0; i < 3; i++) {
            while (true) {
                System.out.println("\nNo. de celular: ");
                celular = Entrada.nextInt();

                if (celular == 0)
                    break;
                System.out.println("Nombre: ");
                nombre = Entrada.nextLine();
                System.out.println("Direccion: ");
                direccion = Entrada.nextLine();
                System.out.println("Tiempo utilizado: ");
                tiempo = Entrada.nextInt();
                System.out.println("Tipo de abono: ");
                tipo = Entrada.nextLine().charAt(0);
                min_utilizados = toMin(tiempo);
                asignar_valores_segun_tipo(tipo, costo, min_libres, cargo_extra);
                calcular_monto(costo, min_libres, cargo_extra, min_utilizados, min_excedidos, monto);
                // array nombre[i] = nombre
                // array direccion[i] = direccion
                // ...
                // i++ // cuantos elementos???
            } // termina while
            mostrar_turno(i);
            System.out.println("Nombre Direccion Minutos libres Minutos excedidos Monto Total\n");
            // for i
            // System.out.println(nombre [i] + ...
            System.out.println(
                    nombre + '\t' + direccion + "\t" + min_libres + "\t\t" + min_excedidos + "\t\t $" + monto + '\n');
        } // termina
    }

    public static void calcular_monto(double costo, int min_libres, double cargo_extra, int min_utilizados,
            Integer min_excedidos, Double monto) {
        min_excedidos = min_utilizados - min_libres;
        if (min_excedidos < 0)
            min_excedidos = 0;
        monto = (costo + min_excedidos * cargo_extra) * 1.21;
    }

    /*
     * void solicitar_datos (int& celular, string& nombre, string& direccion, int&
     * tiempo, char& tipo) { System.out.println("\nNo. de celular: "; celular;
     * cin.ignore(); if (celular == 0) break; System.out.println("Nombre: ";
     * getline(cin, nombre); System.out.println("Direccion: "; getline(cin,
     * direccion); System.out.println("Tiempo utilizado: "; tiempo;
     * System.out.println("Tipo de abono: "; tipo; }
     */
    public static void mostrar_turno(int i) {
        if (i == 0)
            System.out.println("\nTurno mañana \n\n");
        else if (i == 1)
            System.out.println("\nTurno tarde \n\n");
        else
            System.out.println("\nTurno noche \n\n");
    }

    public static void asignar_valores_segun_tipo(int tipo, Double costo, Integer min_libres, Double cargo_extra) {
        switch (tipo) {
            case 'a':
                costo = 70D;
                min_libres = 300;
                cargo_extra = 0.09;
                break;
            case 'b':
                costo = 55D;
                min_libres = 200;
                cargo_extra = 0.15;
                break;
            case 'c':
                costo = 40D;
                min_libres = 100;
                cargo_extra = 0.21;
                break;
            case 'd':
                costo = 28D;
                min_libres = 60;
                cargo_extra = 0.29;
                break;
            case 'e':
                costo = 19D;
                min_libres = 40;
                cargo_extra = 0.37;
                break;
        }
    }

    public static int toMin(int t) {
        int horas = t / 100;
        int minutos = t % 100;
        return minutos + horas * 60;
    }
}
