package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int i, m, a;
        a = 0;

        System.out.println("Ingrese un número: ");
        m = Teclado.nextInt();

        System.out.println("Los primeros " + m + " son múltiplos de 3 pero no son de 5" + "\n\n");

        for (i = 0; i < m; i++) {

            a += 3;

            if (a % 5 != 0) {
                System.out.println(a);
            } else {
                i--;
            }

        }
    }
}