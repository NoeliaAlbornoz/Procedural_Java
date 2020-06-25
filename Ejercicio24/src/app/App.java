package app;

import java.util.Scanner;

public class App {

    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-24: Dada una serie de M pares {color, número} que corresponden a los
         * tiros de una ruleta. Se pide informar: a) cuántas veces salió el número cero
         * y el número anterior a cada cero b) cuántas veces seguidas llegó a repetirse
         * el color negro c) cuántas veces seguidas llegó a repetirse el mismo número y
         * cuál fue d) el mayor número de veces seguidas que salieron alternados el rojo
         * y el negro e) el mayor número de veces seguidas que se negó la segunda
         * docenas.
         */

        int loopnumber, number;
        String color;
        String colorkeeper1 = "";
        String colorkeeper2 = "";
        // color = color ciclo actual / colorkeeper1 = color ciclo anterior /
        // colorkeeper2 = color ciclo ant. ant.
        int quantityzero = 0; // cantidad de nro 0
        int numbeforezero = 0; // nro anterior a cada 0
        int hmtrepblack = 0; // cuantas veces seguidas negro se repetió
        int maxrepblack = 0;
        int maxqtrepeatnumber = 0; // cantidad max un numero repertió
        int qtrepeatnumber = 0; // cuantas veces seguidas repete el mismo nro
        int repeatnumber = 0; // numero repetido
        int maxnumberredblack = 0; // mayor nro veces seguidas salió alternado rojo y negro
        int numberredblack = 0;
        int deniednumber = 0; // cuántas veces seguidas fue negado.
        int mxnumbdenied = 0; // mayor nro veces seguidas negó segunda docenas
        int numberkeeper1 = 0;
        int numberkeeper2 = 0;
        int restnumb = 0;

        System.out.println("How many pairs do you wish to enter?");

        loopnumber = Keyboard.nextInt();

        for (int i = 0; i < loopnumber; i++) {

            System.out.println((i + 1) + " - Enter the number (0~36)");

            number = Keyboard.nextInt();
            Keyboard.nextLine();

            System.out.println("Enter red or black.");

            color = Keyboard.nextLine();

            // El B y la D, repeticion de negro y repetición intercalada, empieza acá:

            if (i == 0) {

            }

            else if (blackBlack(color, colorkeeper1)) {

                numberredblack = 0;

                if (bBRedReset(colorkeeper2, maxrepblack)) {

                    hmtrepblack = 1;

                } else {

                    hmtrepblack++;

                    if (hmtrepblack > maxrepblack) {
                        maxrepblack = hmtrepblack;
                    }
                }

            } else if (color == colorkeeper1) {

                numberredblack = 0;
            } else if (color != colorkeeper1) {

                numberredblack++;

                if (numberredblack > maxnumberredblack) {
                    maxnumberredblack = numberredblack;
                }

            }

            // El A, cuantos 0s y el nro anterior a cada uno, empieza aca:

            if (number != 0) {

            } else if (i == 0) {
                quantityzero++;

            } else {
                quantityzero++;
                numbeforezero = (numbeforezero * 1000) + numberkeeper1;
            }

            // El C, nro repetido más veces y cuantas veces, empieza acá:

            if (i == 0) {

            } else if (number == numberkeeper1) {

                if (number != numberkeeper2 && maxqtrepeatnumber != 0) {

                    qtrepeatnumber = 1;
                } else {

                    qtrepeatnumber++;

                    if (qtrepeatnumber > maxqtrepeatnumber) {
                        maxqtrepeatnumber = qtrepeatnumber;
                    }

                }

            }

            // El ejercicio E, max nro veces negó segunda docena (13 a 24 inclusive)

            if (number > 13 && number < 24) { // si number pertenence segunda docena

                if (deniednumber != 0) {
                    deniednumber = 0;
                }
            } else {
                deniednumber++;

                if (deniednumber > mxnumbdenied) {
                    mxnumbdenied = deniednumber;
                }
            }

            colorkeeper2 = colorkeeper1;
            colorkeeper1 = color;
            numberkeeper2 = numberkeeper1;
            numberkeeper1 = number;
        }

        System.out.println("You entered the number 0 up to " + quantityzero + " times.");
        System.out.println("The number before each of those 0's are:");

        for (int i = 0; i < quantityzero; i++) {

            if (numbeforezero < 37) {

                System.out.println(numbeforezero);

            } else {
                restnumb = numbeforezero % 1000;
                numbeforezero = numbeforezero / 1000;

                System.out.println(restnumb);
            }

        }

        System.out.println("Red and black alternated up to " + maxnumberredblack + " times in a row.");
        System.out.println("The color black repeated up to " + hmtrepblack + " times in a row.");
        System.out.println("The most repeated number in a row is " + repeatnumber + " and repeated up to "
                + maxqtrepeatnumber + " times.");
        System.out.println("You denied the second dozen up to " + mxnumbdenied + " times in a row");

    }

    public static boolean blackBlack(String color, String colorkeeper1) {
        return (color.equalsIgnoreCase("BLACK") && colorkeeper1.equalsIgnoreCase("BLACK"));
    }

    public static boolean bBRedReset(String colorkeeper2, int maxrepblack) {
        return (!colorkeeper2.equalsIgnoreCase("BLACK") && maxrepblack != 0);
    }

}