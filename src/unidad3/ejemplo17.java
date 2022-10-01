package unidad3;
import java.util.Scanner;
public class ejemplo17 {

	public static void main(String[] args) {
		
		String nombre;
		int edad;
		float estatura;
		
		Scanner entradaDato = new Scanner(System.in);
		
		System.out.println("Dame tu nombre ");
		nombre = entradaDato.nextLine();
		
		System.out.println("Dame tu edad ");
		edad = entradaDato.nextInt();
		
		System.out.println("Dame tu estatura ");
		estatura = entradaDato.nextFloat();
		
		System.out.println("Datos capturados: ");
		System.out.println(" Nombre: " + nombre +"\n Edad: " + edad + "\n Estatura: " + estatura);
		
		
	}

}
