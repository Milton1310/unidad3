package unidad3;

import java.util.Scanner; // usaremos la clase (caja de herramientas) util y el la Objeto (herramienta) Scanner

public class ejemplo17 {

	public static void main(String[] args) {
	    // En esta primera se declaran las variables que usaremos mas adelante y les daremos valor
		String nombre;//variable nombre de tipo string sin valor todavia
		int edad;	  //variable edad   de tipo entero sin valor todavia
		float estatura;//variale estatura de tipo float(usaremos decimales por eso no se usa int), sin valor todavia 
		
		
		
		Scanner entradaDato = new Scanner(System.in); // usamos el objeto Scanner entradaDato (puedes ponerle el nombre que quieras), new Scanner(System.in) es para decir a la herramienta que hacer
		
		
		/* En esta parte del cogdigo usaremos entrada y salida de datos
		 * haremos que se imprima en consola lo que queremos que se introdisca para eso usamos lo ya visto System.out.println()
		 * para la entrada del dato usaremos las variables ya asignadas al principio del codigo que aun no tienen valor
		 * usaremos el objeto entradaDato y le asignaremos un metodo o una funcionalidad
		 * nextLine() esto hace que podamos introducir datos en la consola, lo que se introdusca en la consola no importa lo que sea, se tomara conmo String
		 * nextInt() esto nos permite introducir un dato numerico en la consola
		 * nextFloat() nos permite introducir datos numericos reales
		 * nextDouble nos permite introducir datos numericos reales mas precisos o con mas numeros decimales */
		
		System.out.println("Dame tu nombre ");//imprime en consola "Dame tu nombre "
		nombre = entradaDato.nextLine();//aqui usaremos la variable nombre antes declarada, usaremos el objeto entradaDato con el metodo nextLine(), para introducir un string en consola
		
		
		
		System.out.println("Dame tu edad ");//imprimir "Dame tu edad " en consola
		edad = entradaDato.nextInt();// uso de la variable edad y le daremos el valor del objeto entradaDato con el metodo nextInt() para introducir un dato numerico
		
		
		
		System.out.println("Dame tu estatura ");//imprimir  "Dame tu estatura " 
		estatura = entradaDato.nextFloat();// uso de la variable estatura con el valor del objeto entradaDato con el metodo nextFloat() para introducir un dato numetico real
		
		
		System.out.println("Datos capturados: ");//imprimir "Datos capturados"
		System.out.println(" Nombre: " + nombre +"\n Edad: " + edad + "\n Estatura: " + estatura); //imprimir en consola los datos capturados un salto de linea en cada 1
		
		
	}

}//fin codigo
