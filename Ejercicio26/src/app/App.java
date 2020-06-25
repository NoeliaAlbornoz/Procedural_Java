package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-26: Dado un número entero positivo entre 1 y 3999 informar su
         * correspondiente número Romano.
         */

        int numero, unidad, decena, centena, millar;

        System.out.println("Ingresar un número positivo entre 1 y 3999: ");
        numero = Teclado.nextInt();

        //necesito descomponer el numero para convertir cada parte segun la numeracion romana
        //si obtengo el resto de la division por 10, me va quedando cada parte del numero
        //un ejemplo con el numero 125 (tiene unidad, decena y centena)

        unidad = numero % 10; //125 % 10 = 5 (el numero que me queda para dividir es 12, porq el 5 es su resto y lo guardo como unidad)
        numero = numero / 10; //12 / 10 = 1,2
        decena = numero % 10; //1,2 % 100 = 2 (el numero q me queda para dividir es 1, el 2 es su resto y lo guardo como la decena)
        numero = numero / 10; //1 / 10 = 0,1
        centena = numero % 10; //0,1 % 10 = 1 (el ultimo componente lo guardo como centena)
        numero = numero / 10; //no es necesario
        millar = numero % 10; //no tiene
        numero = numero / 10; //no 

        //ya tengo por separado cada numero componente del 125 para transformar:
        //unidad = 5  decena = 2  centena = 1

        switch (millar) {
            case 1:
                System.out.print("M");
                break;
            case 2:
                System.out.print("MM");
                break;
            case 3:
                System.out.print("MMM");
                break;

        }

        switch (centena) {
            case 1:
                System.out.print("C");
                break;
            case 2:
                System.out.print("CC");
                break;
            case 3:
                System.out.print("CCC");
                break;
            case 4:
                System.out.print("CD");
                break;
            case 5:
                System.out.print("D");
                break;
            case 6:
                System.out.print("DC");
                break;
            case 7:
                System.out.print("DCC");
                break;
            case 8:
                System.out.print("DCCC");
                break;
            case 9:
                System.out.print("CM");
                break;

        }

        switch (decena) {
            case 1:
                System.out.print("X");
                break;
            case 2:
                System.out.print("XX");
                break;
            case 3:
                System.out.print("XXX");
                break;
            case 4:
                System.out.print("XL");
                break;
            case 5:
                System.out.print("L");
                break;
            case 6:
                System.out.print("LX");
                break;
            case 7:
                System.out.print("LXX");
                break;
            case 8:
                System.out.print("LXXX");
                break;
            case 9:
                System.out.print("XC");
                break;

        }

        switch (unidad) {
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;
            case 3:
                System.out.print("III");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
                System.out.print("V");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;

        }

    }
}