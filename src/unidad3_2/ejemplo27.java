package unidad3_2;

import java.util.Scanner;

public class ejemplo27 {

    public static void main (String[]args){

        int velocidad;

        Scanner entradaDato = new Scanner(System.in);

        System.out.println("INTRODUZCA VELICIDAD DEL VEHICULO");

        velocidad = entradaDato.nextInt();

        if (velocidad <= 25){
            System.out.println("VELOCIDAD MUY LENTA");
        }else {
            if (velocidad > 25 && velocidad <= 50){
                System.out.println("VELICIDAD MODERADA");
            }else{
                if (velocidad > 50 && velocidad <= 80){
                    System.out.println("LLEGAS A TIEMPO");
                }else {
                    if (velocidad > 80){
                        System.out.println("VAS MUY RAPIDO");
                    }
                }
            }
        }

    }
}
