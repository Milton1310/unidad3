package unidad3_2;

import java.util.Scanner;
public class ejemplo20 {

    public static void main (String [] args) {

        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        edad = entrada.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }

    }
}
