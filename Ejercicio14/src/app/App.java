package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-14: En un torneo de fútbol participan K equipos. El torneo se juega
         * con el sistema de todos contra todos. Por cada partido disputado por un
         * equipo se dispone de la siguiente información : a) Nro. de equipo, b) Código
         * del resultado ('P'= Perdido, 'E'= Empatado, 'G'= Ganado). Se arma un lote de
         * datos con todos los resultados del torneo, agrupados por Nro. de equipo.
         * Desarrollar el programa que imprima: 1) Por cada equipo, su número y el
         * puntaje total que obtuvo (suma 3 si gana, y 1 si empata). 2) Nro. de equipo
         * que totalizó la menor cantidad de puntos. (hay solo uno).
         */

        int k;
        int puntajeTotal = 0;
        int puntajePorPartido = 0;
        int menorPuntaje = 0;
        int equipoMenorPuntaje = 0;

        System.out.println("Ingresar el número de equipos que jugaron el torneo: ");
        k = Teclado.nextInt();

        for (int i = 0; i < k; i++) {

            System.out.println("Equipo Nro. " + (i + 1));

            for (int j = 0; j < (k - 1); j++) {

                System.out.print("Partido Nro. " + (j + 1) + ": ");
                puntajePorPartido = Teclado.nextInt();
                puntajeTotal += puntajePorPartido;

            }

            System.out.println("Puntaje total: " + puntajeTotal + "\n");

            if (menorPuntaje == 0) {

                menorPuntaje = puntajeTotal;
                equipoMenorPuntaje = i + 1;

            } else if (puntajeTotal < menorPuntaje) {

                menorPuntaje = puntajeTotal;
                equipoMenorPuntaje = i + 1;
            }

            puntajeTotal = 0;

        }

        System.out.print("Menor puntaje: Equipo Nro. " + equipoMenorPuntaje);

    }
}