package practicas;
import java.util.Scanner;
public class practica5 {

    public static void main(String[]args){

        double kilometros,millas;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce cantidad de kilometros");
        kilometros = entrada.nextDouble();

        millas = kilometros * 0.62137;

        System.out.println(kilometros + " equivalen a" + millas + "millas" );

    }
}
