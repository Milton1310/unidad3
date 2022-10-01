package unidad3;

import javax.swing.JOptionPane; // importa una caja de herramientas de la librerias de java,  javax = nombre de la libreria, swing = clase (caja de herramienta), JOptionPane = herramienta

public class ejemplo16 {

	public static void main(String[] args) {
		
		String nombre = "pepito"; // Variable de tipo String
		
		int edad = 12; // Variable de tipo entero (Int)
		
		JOptionPane.showInternalMessageDialog(null, "Nombre "+ nombre + "\n Edad "+ edad); // Herramienta JOptionPane.showInternalMessageDialog con mensaje 
											  // >>>>>> \n <<<< representa un salto de line o un enter 
				

	}

}
