package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex8 {
     
     public static void main (String args[]) {
         
        int sal, gasto, total; 

    sal = Integer.parseInt(JOptionPane.showInputDialog ("Digite seu Salario: "));
    gasto = Integer.parseInt(JOptionPane.showInputDialog ("Digite seus gastos: "));
    
    total = sal - gasto;
    
    if (gasto < sal){
       JOptionPane.showMessageDialog (null, "Gastos dentro do orçamento");
    }
    else if (gasto > sal) {
       JOptionPane.showMessageDialog (null, "Orçamento estourado");
    }
    
    }  
}