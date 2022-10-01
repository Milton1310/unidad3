package unidad3;
import javax.swing.JOptionPane;//importar libreria
public class ejemplo19 {

	public static void main(String[] args) {
		
		double pies, pulgadas;//declarar variables topo Double
		String medida;//declarar variable tipo String
		
		medida = JOptionPane.showInputDialog("Introdusca pulgadas para convertir") ;//usar el metodo showInputDialog("Introdusca pulgadas para convertir"), para abrir una ventana con un mensaje que nos permita introducir un String ojo
		
		pulgadas = Double.parseDouble(medida);//asignar el valor a la variable pulgadas 
		/*lo que hace Double.parseDouble es transformar un tipo de dato cualquiera solo que sean caracteres numericos a Double (umeros reales mas precisos)
		 * para eso usaremos el objeto Double con el metodo parseDouble() y en los parametros ponemos el dato que queremos convertir en este caso 
		 * la varible medida*/
		
		pies = pulgadas / 12;//asignar a la variable pies el calculo para convertir de pies a pulgadas
		
		JOptionPane.showMessageDialog(null, pulgadas + " Equivalen a: " + pies + " Pies"); ;//abrir una ventana de dialogo con la respuesta en su mensaje
		
		
	}

}
