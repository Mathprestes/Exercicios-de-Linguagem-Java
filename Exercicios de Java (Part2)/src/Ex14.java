package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex14 {
    
    public static void main(String args[]){
    
       double chico=150,juca=110,anos=10 ;
    
       while(chico>=juca){
        
           chico=chico+2;
           juca=juca+3;
           anos=anos+1;
    }
          
       JOptionPane.showMessageDialog (null, "sera necessario todos esses anos para que juca fique maior que chico: " +anos); 
    
    }
}
