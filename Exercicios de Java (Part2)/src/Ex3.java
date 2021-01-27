package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex3 {
     
     public static void main (String args[]) {
         
        int sal;
        double grat, imp, result; 

        sal = Integer.parseInt(JOptionPane.showInputDialog (" Digite o seu Salario: "));
        
        grat = 0.05 * sal;
        imp = 0.07 - sal;
        result = sal + grat - imp;
                
        JOptionPane.showMessageDialog (null, "Seu Salario é: " + result);

    }
}