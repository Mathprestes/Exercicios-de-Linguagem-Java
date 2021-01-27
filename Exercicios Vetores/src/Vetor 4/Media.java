/*
Criar um vetor de 5 posições de inteiros. 
Preencher e exibir a média dos valores armazenados no vetor.
 */
import javax.swing.JOptionPane;

public class Media {
    public static void main (String[] args) {
        
      int vetor[] = new int[5];
      int soma = 0;
      
      for (int cont=0; cont<5; cont++) {
          vetor[cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite") );
      }
        
      for (int cont=0; cont<5; cont++) {
          soma += vetor[cont]; //soma vai (receber ela mesma) + o vetor e guarda no soma
      }  
        
      System.out.println ("A media é : " + (soma / 5));    
   
    }
}
