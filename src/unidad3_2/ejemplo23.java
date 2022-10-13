package unidad3_2;

import java.util.Scanner;

public class ejemplo23 {

    public static void main (String[]args){

        int numero;

        System.out.println("Introduzca un numero");

        Scanner entrada = new Scanner(System.in);

        numero = entrada.nextInt();

        if (numero == 0){
            System.out.println("Su numero es cero");
        }
        if (numero > 0){
            System.out.println("Su numero es positivo");
        }
        if (numero < 0){
            System.out.println("Su numero es negativo");
        }


    }
}
