package app;

import java.util.Scanner;

public class App {

    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        double number, finalaverage;
        double maxneg = 0;
        double minpos = 0;
        double minrang = 0;
        double average = 0;
        int counter = 0;

        number = chooseANumber();

        while (conditionToStop(number)) {

            counter++;

            average = average + number;

            if (number < 0 && counter == 1) {

                maxneg = number;
            } else if (number < 0) {

                if (number > maxneg) {

                    maxneg = number;

                }
                ;
            } else if (minpos == 0) {
                minpos = number;
            } else if (number < minpos) {
                minpos = number;
            }
            ;

            if (conditionRangoIf(number)) {

            } else if (number < minrang) {
                minrang = number;
            }

            number = chooseANumber();

        }

        finalaverage = average / counter;

        if (maxneg != 0) {

            System.out.println("The maximun negative value is " + maxneg);
        }
        ;

        if (minpos != 0) {
            System.out.println("The minimun positive value is " + minpos);
        }
        ;

        if (minrang != 0) {
            System.out.println("The minimun value within the range -17.3 and 26.9 is " + minrang);
        }
        ;

        if (finalaverage != 0) {
            System.out.println("The average value is " + finalaverage);
        }
        ;

    }

    public static double chooseANumber() {
        double number2;

        System.out.println("Enter a number. To end, enter 0.");

        number2 = Keyboard.nextInt();

        return number2;
    }

    public static boolean conditionToStop(double number3) {
        return (number3 != 0);

    }

    public static boolean conditionRangoIf(double number4) {
        return (number4 <= -17.3 || number4 >= 26.9);
    }
}