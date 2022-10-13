package unidad3_2;

import javax.swing.JOptionPane;

public class ejemplo21 {
    public static void main (){

        int edad;
        String entrada;

        entrada = JOptionPane.showInputDialog("Introduzca tu edad");

        edad = Integer.parseInt(entrada);

        if (edad >= 18){
            JOptionPane.showInternalMessageDialog(null,"Eres mayor de edad");
        }else{
            JOptionPane.showInternalMessageDialog(null, "Eres menor de edad");
        }


    }
}
