package practicas;

import java.util.Scanner;

public class practica6 {

    public static void main (String[]args){
        double pulgadas,centimetros;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cantidad de pulgadas");
        pulgadas = entrada.nextDouble();

        centimetros = pulgadas * 2.54;

        System.out.println(pulgadas + " equivalen a" + centimetros + "centimetros" );
    }
}
