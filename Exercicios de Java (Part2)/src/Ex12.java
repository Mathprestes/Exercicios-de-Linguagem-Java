package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex12 {
       
    public static void main(String args[]){
           
        int v1,v2,x,y=0;
           
           v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
           v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
           
           if (v2>v1){
               
               for(x=v1;x<=v1;x++){
                   y=y+(x+1);
               }
            
               JOptionPane.showMessageDialog (null, "A soma destes numeros e dos numeros que estao entre eles Ã©:"+y);
           }   
    }
}
