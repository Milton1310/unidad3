package unidad3;
import java.util.Scanner ;
public class ejemplo18 {

	public static void main(String[] args) {
		
		int valor1, valor2, resultado;// declaracion de datos numericos enteros
		Scanner entrada = new Scanner(System.in); //llamar a la herramienta Scanner 
		
		System.out.println("Suma :");//imprimir "Suma :" en la consola
		
		System.out.println("Introdusca el primer valor");//imprimir "Introdusca el primer valor" en consola
		valor1 = entrada.nextInt();// asignar valor a la variable valor1 y leer lo que se introduce en la consola
		
		System.out.println("Introduce el segundo valor");//imprimir "Introduce el segundo valor"
		valor2 = entrada.nextInt() ;// asignar valor a la variable valor2 y leer lo que se introduce en la consola
		
		resultado = valor1 + valor2; //asignar a la variable resultado el valor de las variables valor1 y valor2 sumadas
		System.out.println("El resultado es: "+ resultado);//imprimir resultado
						

	}

}
