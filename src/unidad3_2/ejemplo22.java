package unidad3_2;

import java.util.Scanner;

public class ejemplo22 {
    public static void main (String [] args){

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduzca un numero");

        numero = entrada.nextInt();

        if (numero%2 == 0){
            System.out.println("Su numero es par");
        }else {
            System.out.println("Su numero es impar");
        }


    }
}
