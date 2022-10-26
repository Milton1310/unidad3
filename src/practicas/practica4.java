package practicas;
import java.util.Scanner;
public class practica4 {

    public static void main(String[]args){

        String nombre, edad, estatura;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Introcuce tu nombre ");
        nombre = entrada.nextLine();
        System.out.println("Introcuce tu edad");
        edad = entrada.nextLine();
        System.out.println("Introcuce tu estatura");
        estatura = entrada.nextLine();

        System.out.println("Nombre: " + nombre + "\n Edad: " + edad + "\n Estatura: " + estatura);

    }
}
