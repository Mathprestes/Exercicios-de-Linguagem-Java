package trabdeprogramaçaoemJAVA;


import javax.swing.JOptionPane;

public class Ex7 {
     
     public static void main (String args[]) {
         
        int x; 

    x = Integer.parseInt(JOptionPane.showInputDialog (" Digite um numero: "));
    
    if (x % 5 == 0){
       JOptionPane.showMessageDialog (null, "Ele é Divisivel");
    }
    else {
       JOptionPane.showMessageDialog (null, "Ele nao é Divisivel");
    }
    
    }  
}
