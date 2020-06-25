package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //Dados 1000 números, imprimir la suma.

        int suma = 0;
        int numero;

        //Inicializador --> i = 1
        //Condición de seguir dando vueltas --> i <= 1000
        //Incrementador o variador de condicion
        //i: iterador
        //i++ --> i = i + 1

        for(int i = 0; i < 5; i++){

            System.out.println("Ingrese el número de la vuelta " + (i + 1));

            numero = Teclado.nextInt();

            suma = suma + numero;

        }

        System.out.println("La suma es " + suma);
       
    }
}