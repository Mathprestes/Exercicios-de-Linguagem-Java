package trabdeprogramaçaoemJAVA;


import javax.swing.JOptionPane;

public class Ex2 {
     
     public static void main (String args[]) {
         
        int pol; 
        double cent; 

        pol = Integer.parseInt(JOptionPane.showInputDialog (" Digite o valor das Polegadas: "));
        
        cent = (double) (2.54 * pol);
        
        JOptionPane.showMessageDialog (null, "Quantidade em Centimetros: " + cent);

    }
}