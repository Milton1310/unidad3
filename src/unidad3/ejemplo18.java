package unidad3;
import java.util.Scanner ;
public class ejemplo18 {

	public static void main(String[] args) {
		
		int valor1, valor2, resultado;
		Scanner entrada = new Scanner(System.in); //poner new antes del Scanner 
		
		System.out.println("Suma :");
		
		System.out.println("Introdusca el primer valor");
		valor1 = entrada.nextInt() ;
		
		System.out.println("Introduce el segundo valor");
		valor2 = entrada.nextInt() ;
		
		resultado = valor1 + valor2;
		System.out.println("El resultado es: "+ resultado);
						

	}

}
