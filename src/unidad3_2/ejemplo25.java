package unidad3_2;

import java.util.Scanner;

public class ejemplo25 {

    public static void main (String[] args){

        int cal;

        Scanner entradaDato = new Scanner(System.in);

        System.out.println("Introduzca su calificacion");

        cal = entradaDato.nextInt();


        if (cal <= 5 ){
           System.out.println("Por poco");
        }
        if (cal >= 6 && cal <= 8){
           System.out.println("Mejor");
        }
        if (cal >= 9 && cal <= 10){
           System.out.println("Excelente");
        }
        entradaDato.close();


    }

}
