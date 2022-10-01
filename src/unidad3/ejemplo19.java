package unidad3;
import javax.swing.JOptionPane;
public class ejemplo19 {

	public static void main(String[] args) {
		
		double pies, pulgadas;
		String medida;
		
		medida = JOptionPane.showInputDialog("Introdusca pulgadas para convertir") ;
		
		pulgadas = Double.parseDouble(medida);
		
		pies = pulgadas / 12 ;
		
		JOptionPane.showMessageDialog(null, pulgadas + " Equivalen a: " + pies + " Pies"); ;
		
		
	}

}
