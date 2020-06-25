package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-25: Dada una serie de caracteres que conforman una oración, donde cada
         * palabra está separada de la siguiente por un carácter blanco y la oración
         * finaliza con un punto. Se pide informar: a) cantidad de veces que apareció
         * cada vocal b) cantidad de palabras que contiene la oración c) cantidad de
         * letras que posee la palabra más larga.
         */

        String oracion;
        char caracter; // el for recorrera la oracion un caracter a la vez
        int contarA = 0;
        int contarE = 0;
        int contarI = 0;
        int contarO = 0;
        int contarU = 0;
        int contarPalabra = 0;
        int contarLetra = 0;
        int palabraMax = 0;

        System.out.println("Ingrese una frase: ");
        oracion = Teclado.nextLine().toLowerCase(); // agrego toLowerCase() para no tener problemas de validacion
                                                    // en el switch

        for (int i = 0; i < oracion.length(); i++) { // el for recorre la oracion caracter a caracter gracias a la
                                                     // funcion length(), que indica la longitud de la oracion (cuantos
                                                     // caracters totales tiene, incluidos espacios y punto) -lo googlee

            caracter = oracion.charAt(i); // charAt se utiliza para leer caracteres de un string y la i indica la
                                          // posicion de cada caracter en la cadena, ej. en la palabra "hola", la "h"
                                          // tiene posicion 0, la "o" la posicion 1 y asi...

            if (caracter != ' ' && caracter != '.') {// si el caracter no es un espacio ni un punto, entonces es una
                                                     // letra
                contarLetra++;
            } else if (contarLetra > palabraMax) { // igual que los maximos de los otros ejercicios, va comparando
                palabraMax = contarLetra; // este contador va acumulando todas las letras de una palabra, por eso hay q
                                          // volver a inicializarlo una vez q se cuente la palabra en el switch
            }

            switch (caracter) {
                case 'a':
                    contarA++;
                    break;
                case 'e':
                    contarE++;
                    break;
                case 'i':
                    contarI++;
                    break;
                case 'o':
                    contarO++;
                    break;
                case 'u':
                    contarU++;
                    break;
                case ' ': // este caracter ' ' es un espacio que separa una palabra de otra
                case '.': // el punto significa lo mismo q el espacio para la ultima palabra de la oracion
                    contarPalabra++;
                    contarLetra = 0; // cada vez que cuento una palabra, reinicio el contador de letras, porq voy a
                                     // necesitarlo para acumular las letras de la siguiente palabra
                    break;
            }

        }
        System.out.println("Vocal A: " + contarA);
        System.out.println("Vocal E: " + contarE);
        System.out.println("Vocal I: " + contarI);
        System.out.println("Vocal O: " + contarO);
        System.out.println("Vocal U: " + contarU);
        System.out.println("Cantidad de palabras en esta frase: " + contarPalabra);
        System.out.println("Cantidad de letras que posee la palabra mas larga: " + palabraMax);

    }
}