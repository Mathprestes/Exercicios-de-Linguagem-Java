//Ex 2: Leia um vetor de 6 posições de valores reais e exiba de trás para frente.
import javax.swing.JOptionPane;

public class Exibindo_de_tras_pra_frente {
    public static void main(String args[]){

    double vetor[] = new double[6];
    
    for (int cont=0; cont<6; cont++) {
        vetor[cont] = Double.parseDouble(JOptionPane.showInputDialog("DIGITE"));
    }

    for (int cont=5; cont>=0; cont--) {
        System.out.println(vetor[cont]);
    }
  }
}