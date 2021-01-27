import javax.swing.JOptionPane;

public class Ex9 {
       
    public static void main(String args[]){
           
        int x;
           
        x = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
           
           if(x<8){
            JOptionPane.showMessageDialog (null, "Infantil A" );
           }
           else if(x<11){
            JOptionPane.showMessageDialog (null, "Infantil B" );
           }
           else if(x<13){
            JOptionPane.showMessageDialog (null, "Juvenil A" );
           }
           else if(x<17){
            JOptionPane.showMessageDialog (null, "Juvenil B" );
           }
           else{
            JOptionPane.showMessageDialog (null, "adulto" );
           }
       }
    }
