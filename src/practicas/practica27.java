package practicas;

import java.util.Scanner;
//Sumatoria de los numeros
//mayor numero
//menor numero
public class practica27 {

    public static void main (String[]args){

        int numero,x,controlador = 1, cercano = 0;
        int mayor = 0, menor = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("cuantos numeros tendra la serie? ");
        x = entrada.nextInt();

        do {

            System.out.println("introduzca el numero " + controlador);
            numero = entrada.nextInt();

            if (controlador == 1){
                mayor = numero;
                menor = numero;

            }
            if (controlador == 1 && numero < 100){
                cercano = numero;
            }
            //#######################################################################################################3


            if(numero < 100){

                if (numero >= cercano) {
                    cercano = numero;
                }

            if (numero >= mayor){
                mayor = numero;
            }
            if (numero <= menor){
                menor = numero;
            }

            }
            controlador++;

        }while(controlador<= x);

        System.out.println("El numero mas cercano a 100 es " + cercano);
        System.out.println("El numero mas grande es " + mayor);
        System.out.println("El numero mas chico es " + menor);

    }

}
