package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        
        //int a; 
        //int b;
        //int p;  
        //int v;

        int a, b, p, v;

        System.out.println("Ingrese la altura:");
        
        a = Teclado.nextInt();

        System.out.println("Ingrese la base:");
    
        b = Teclado.nextInt();

        System.out.println("Ingrese la profundidad:");
        
        p = Teclado.nextInt();

        v = a * b * p;

        System.out.println("El volumen es " + v);

    }
}