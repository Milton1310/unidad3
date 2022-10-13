package unidad3_2;

import javax.swing.JOptionPane;

public class ejemplo24 {

    public static void main (String[]args){

        int edad;
        String entrada;

        entrada = JOptionPane.showInputDialog("Introduzca su edad");

        edad = Integer.parseInt(entrada);


        if (edad <= 11){
            JOptionPane.showMessageDialog(null,"Eres un niño ");
        }
        if (edad >= 12 && edad <= 17){
            JOptionPane.showMessageDialog(null,"Eres un Adolescente ");
        }
        if (edad >= 18 && edad <= 35){
            JOptionPane.showMessageDialog(null,"Eres un Adulto Joven");
        }
        if (edad > 35){
            JOptionPane.showMessageDialog(null,"Eres un Adulto Mayor");
        }


    }
}
