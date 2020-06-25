package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // declaracion de variables
        char letter;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int letterCounter = 0; // cuenta numero de letra
        int maxLetter = 0; // cuenta numero maximo de letras total
        int wordCounter = 0; // cuenta la cantidad de palabras

        System.out.println("Enter a letter or a space of first sentence. To end enter a dot");
        letter = Teclado.nextLine().charAt(0);

        // Hola mundo como estas.

        while (letter != '.') {
            
            letterCounter = 0; // reseteo contador de letras por cada palabra
            while (letter != '.' && letter != ' ') {
                switch (vocalNormalizada(letter)) {

                    case 'a':
                        a++;

                        break;

                    case 'e':
                        e++;
                        break;

                    case 'i':
                        i++;
                        break;

                    case 'o':

                        o++;
                        break;

                    case 'u':
                        u++;
                        break;

                    default:
                        break;
                }
                letterCounter++;
           
                letter = Teclado.nextLine().charAt(0);

            }

            if (letterCounter > maxLetter) {
                maxLetter = letterCounter;
            }

            wordCounter++;
            if (letter != '.')

                letter = Teclado.nextLine().charAt(0);
        }

        System.out.println("The vowel a appeared " + a + " times");
        System.out.println("The vowel e appeared " + e + " times");
        System.out.println("The vowel i appeared " + i + " times");
        System.out.println("The vowel o appeared " + o + " times");
        System.out.println("The vowel u appeared " + u + " times");

        System.out.println("The longest word has " + maxLetter + " letters");
        System.out.println("This sentence has " + wordCounter + " words");

    }

    public static char vocalNormalizada(char letter) {
        switch (letter) {
            case 'a':
            case 'A':
            case 'á':
                // agregar las que faltan
                return 'a';

            case 'e':
            case 'E':
            case 'é':
                // agregar las que faltan
                return 'e';

            case 'i':
            case 'I':
            case 'í':
                // agregar las que faltan
                return 'i';

            case 'o':
            case 'O':
            case 'ó':
                // agregar las que faltan
                return 'o';

            case 'u':
            case 'U':
            case 'ú':
                // agregar las que faltan
                return 'u';

        }

        return '!';
    }
}