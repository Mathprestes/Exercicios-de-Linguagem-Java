package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex5 {
     
     public static void main (String args[]) {
         
        int x, y; 

    x = Integer.parseInt(JOptionPane.showInputDialog (" Digite um numero: "));
    y = Integer.parseInt(JOptionPane.showInputDialog (" Digite um Segundo numero: "));
        
    if (x == y){
       JOptionPane.showMessageDialog (null, "Sao Iguais");
    }
    else {
       JOptionPane.showMessageDialog (null, "Sao Diferentes");
    }
    
    }  
}