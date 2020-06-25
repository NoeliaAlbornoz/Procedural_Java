package app;

import java.util.Scanner;

public class App {

    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int number; // nro dado por el usuário
        int totalsublotcounter = 0; // total de nros del lote entero (de todos los sublotes)
        int sublotcounter = 0; // cuantos sublotes hay
        int maxnum = 0; // nro máximo del conjunto
        int sublotmaxnum = 0; // sublote del valor máximo del lote entero
        int posrelsublotmaxnum = 0; // posición relativa del valor máximo del lote

        number = chooseANumber();

        while (number >= 0) {

            int averagecounter = 0; // contador para sacar el promedio y posición relativa de cada nro en el sublote
            double average = 0; // suma de los nros de cada sublote
            double totalaverage; // el promedio total de cada sublote
            int minnumeachsublot = 0; // el menor nro de cada sublote

            sublotcounter++;

            while (number > 0) {

                averagecounter++;

                totalsublotcounter++;

                average = average + number;

                if (number > maxnum) {
                    maxnum = number;
                    sublotmaxnum = sublotcounter;
                    posrelsublotmaxnum = averagecounter;

                }
                

                if (averagecounter == 1) {
                    minnumeachsublot = number;

                } else if (number < minnumeachsublot) {
                    minnumeachsublot = number;

                }

                number = chooseANumber();

            }

            if (average == 0) {
                printOneEmptySublot(sublotcounter);

            } else {
                totalaverage = average / averagecounter;

                printEachSubLot(sublotcounter, totalaverage, minnumeachsublot);
            }

            if (number >= 0) {
                number = chooseANumber();          
            };


        }

        if (sublotcounter == 0) {
            printNoBatch();

        } else if ((sublotcounter != 0 && totalsublotcounter == 0)) {
            printNoSublots(sublotcounter);

        } else {
            printFinalOutput(sublotcounter, maxnum, sublotmaxnum, posrelsublotmaxnum);

        }
    }

    public static int chooseANumber() {

        System.out.println("Enter a whole positive number. Enter 0 to change the sublot and -1 to end the lot");

        int number2 = Keyboard.nextInt();

        return number2;
    }

    public static void printEachSubLot(int a, double b, int c) {
        System.out.println("____________________________");
        System.out.println("");
        System.out.println("* * * * * Sublot " + a + ":* * * * *");
        System.out.println("Average number is " + b);
        System.out.println("Minimun value is " + c);
        System.out.println("____________________________");
        System.out.println("");
    }

    public static void printOneEmptySublot(int a) {
        System.out.println("____________________________");
        System.out.println("");
        System.out.println("The sublot " + a + " is empty! But at least the lot is not empty.");
        System.out.println("____________________________");
        System.out.println("");
    }

    public static void printNoBatch() {
        System.out.println("____________________________");
        System.out.println("");
        System.out.println("This lot is completely empty, not even one sublot! So sad...");
        System.out.println("____________________________");
        System.out.println("");
    }

    public static void printNoSublots(int a) {
        System.out.println("____________________________");
        System.out.println("");
        System.out.println("This lot have " + a + " empty sublots and that's it. The end.");
        System.out.println("____________________________");
        System.out.println("");
    }

    public static void printFinalOutput(int a, int b, int c, int d) {
        

        System.out.println("You entered a total of " + a + " subslots");
        System.out.println("The maximun value of the lot is " + b + " from sublot " + c + " and relative position " + d);
        System.out.println("____________________________");
        System.out.println("");

    }
}