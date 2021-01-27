package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex6 {
       
    public static void main(String args[]){
           
        int b,d;
        double x;
           
           d = Integer.parseInt(JOptionPane.showInputDialog("se identifique digitando (1)cliente(2)funcionario(3)vip"));
           b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor da compra:"));
           
           if(d==2){
              x=b-b*0.10;
              JOptionPane.showMessageDialog (null, "o valor Ã©:"+x );
           }
           
           else if(d==1){
               x=b;
               JOptionPane.showMessageDialog (null, "o valor do cliente Ã©:"+x );
           }
           else{
               x=b-b*0.05;
               JOptionPane.showMessageDialog (null, "o valor Ã©:"+x );
           }
    
 }
}



