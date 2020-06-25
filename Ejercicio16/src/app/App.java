package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-16: Se ingresa un conjunto de valores reales, cada uno de los cuales
         * representan el sueldo de un empleado, excepto el último valor que es cero e
         * indica el fin del conjunto. Se pide desarrollar un programa que determine e
         * informe: a) Cuántos empleados ganan menos $1.520. b) Cuántos ganan $1.520 o
         * más pero menos de $2.780. c) Cuántos ganan $2.780 o más pero menos de $5.999.
         * d) Cuántos ganan $5.999 o más.
         */

         int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
         double sueldo;

         System.out.println("Ingresar sueldo: ");
         sueldo = Teclado.nextDouble();

         while(sueldo > 0){

            if(sueldo >= 5999){
                contador1++;
            } else if(sueldo >= 2780){
                contador2++;
            } else if(sueldo >= 1520){
                contador3++;
            } else {
                contador4++;
            }

            System.out.println("Ingresar sueldo: ");
         sueldo = Teclado.nextDouble();

         }

         System.out.println(contador4 + " empleados ganan menos de $1520.");
         System.out.println(contador3 + " empleados ganan $1520 o más pero menos de $2780.");
         System.out.println(contador2 + " empleados ganan $2780 o más pero menos de $5999.");
         System.out.println(contador1 + " empleados ganan $5999 o más.");

    }
}