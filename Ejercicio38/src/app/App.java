package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-38: Desarrollar un procedimiento tal que dada una hora (HHMMSS) y un
         * tiempo también en formato HHMMSS devuelva la nueva hora que surge de sumar el
         * tiempo a la hora inicial, considere también si cambió el día.
         */

        int horario, tiempo, horas, minutos, segundos, horas2, minutos2, segundos2;

        horario = ingresarHorario();
        tiempo = ingresarTiempoExtra();

        segundos = calcularSegundos(horario);
        minutos = calcularMinutos(horario);
        horas = calcularHoras(horario);

        segundos2 = calcularSegundos(tiempo);
        minutos2 = calcularMinutos(tiempo);
        horas2 = calcularHoras(tiempo);

        horas += horas2;
        minutos += minutos2;
        segundos += segundos2;

        if (igual60(segundos)) {
            minutos++;
            segundos = 0;
        } else if (mayor60(segundos)) {
            minutos++;
            segundos -= 60;
        }

        if (igual60(minutos)) {
            horas++;
            minutos = 0;
        } else if (mayor60(minutos)) {
            horas++;
            minutos -= 60;
        }

        if (cambiaDia00(horas)) {
            horas = 0;
        } else if(cambiaDia(horas)){
            horas = calcularNuevasHoras(horas, horas2); 
        }

        nuevaHora(horas, minutos, segundos);

    }

    public static int ingresarHorario(){

        int horario;

        System.out.println("Ingresar horario (HHMMSS): ");
        horario = Teclado.nextInt();

        return horario;

    }

    public static int ingresarTiempoExtra(){
        
        int tiempo;

        System.out.println("Ingresar tiempo extra (HHMMSS): ");
        tiempo = Teclado.nextInt();

        return tiempo;

    }

    public static int calcularSegundos(int horario){

        int segundos;

        segundos = horario % 100;

        return segundos;

    }

    public static int calcularMinutos(int horario){

        int minutos;

        minutos = (horario / 100) % 100;

        return minutos;

    }

    public static int calcularHoras(int horario){

        int horas;

        horas = horario / 10000;

        return horas;

    }

    public static boolean igual60(int cantidad){

        return cantidad == 60;

    }

    public static boolean mayor60(int cantidad){

        return cantidad > 60;

    }

    public static boolean cambiaDia00(int cantidad){

        return cantidad == 24;

    }

    public static boolean cambiaDia(int cantidad){

        return cantidad > 24;

    }

    public static int calcularNuevasHoras(int horas, int horas2){

        return horas2 - (24 - (horas - horas2));

    }

    public static void nuevaHora(int horas, int minutos, int segundos){

        System.out.println("Nuevo horario: " + horas + "HH " + minutos + "MM " + segundos + "SS.");

    }
}