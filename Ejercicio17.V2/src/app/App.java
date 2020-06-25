package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int cantidad = 0;

        // Do While: Siempre se ejecuta algo, luego condición.

        int numero;

        do{
            System.out.println("Ingrese un número (finaliza cuando ingresa cero o un número negativo): ");
            numero = Teclado.nextInt();

            if(numero > 0)
                cantidad++;
            
        } while (numero > 0);
        

        System.out.println("Ingresaste " + cantidad + " números positivos.");
    }

}