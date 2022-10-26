package practicas;

import java.util.Scanner;

public class practica7 {

    public static void main (String[]args){
        int numSemana;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero del 1 al 7");

        numSemana = entrada.nextInt();

        if(numSemana == 1){
            System.out.println(numSemana + "Pertenece a lunes");
        } else if (numSemana == 2) {
            System.out.println(numSemana + "pertenece a martes");
        } else if (numSemana == 3) {
            System.out.println(numSemana +"pertenece a miercoles");
        } else if (numSemana == 4) {
            System.out.println(numSemana + "pertenece a jueves");
        } else if (numSemana == 5) {
            System.out.println(numSemana + "pertenece a viernes");
        } else if (numSemana == 6) {
            System.out.println(numSemana + "pertenece a sabado");
        } else if (numSemana == 7) {
            System.out.println(numSemana + "pertenece a domingo");
        }

    }
}
