package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        /*
         * Ej. MI-30: Desarrollar una función que calcule el máximo común divisor de dos
         * números enteros A, B con el siguiente algoritmo: 1) Dividir A por B, y
         * calcular el resto (0 < R < B) 2). Si R = 0, el MCD es B, si no seguir en 3) 3)
         * Reemplazar A por B, B por R, y volver al paso 1).
         * 
         * MCD: Descomponemos cada número en factores primos. Después, señalamos los factores comunes.
         */


         int A, B, R;
         int MCD = 0;

         A = ingresarNumeroA();
         B = ingresarNumeroB();

         do{

            R = calcularMCD(A, B);

            if(R == 0){
                MCD = B;
                resultado(MCD);
            } else {
               A = B;
               B = R;
            }
   
         }while(R != 0);
  
    }

    public static int ingresarNumeroA(){

        int A;
        
        System.out.println("Ingresar un número: ");
        A = Teclado.nextInt();

        return A;
        
    }

    public static int ingresarNumeroB(){

        int B;
        
        System.out.println("Ingresar otro número: ");
        B = Teclado.nextInt();

        return B;
        
    }

    public static int calcularMCD(int A, int B){

        return A % B;

    }

    public static void resultado(int MCD){

        System.out.println("MCD: " + MCD);

    }
}