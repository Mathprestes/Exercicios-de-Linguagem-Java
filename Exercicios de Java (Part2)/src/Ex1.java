package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex1 {
     
     public static void main (String args[]) {
         
         int valor, ante, suce; 

         valor = Integer.parseInt(JOptionPane.showInputDialog (" Digite um numero "));
    
         ante = valor - 1;
         suce = valor + 1;
        
        JOptionPane.showMessageDialog (null, "O Numero Antecessor é: " + ante);
        JOptionPane.showMessageDialog (null, "O Numero Sucessor é: " + suce);
        
     }
     
}