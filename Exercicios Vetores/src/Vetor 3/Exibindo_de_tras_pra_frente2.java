//Ex 4: Crie um vetor de 8 posições de números reais. 
//Crie um segundo vetor com as mesmas definições. Preencha o primeiro vetor e, ao concluir a digitação, armazene estes valores no segundo vetor, 
//porém de trás para frente.
import javax.swing.JOptionPane;


public class Exibindo_de_tras_pra_frente2 {
    public static void main (String[] args) {
        
        double vet1[] = new double[8];
        double vet2[] = new double[8];
        int aux=7;
        
        for (int cont=0; cont<8; cont++) {
            vet1[cont] = Double.parseDouble(JOptionPane.showInputDialog("Digite") );
        }
        
        for (int cont=0; cont<8; cont++) {
            vet2[aux] = vet1[cont];
            aux--;
        }
        
        System.out.print("Vetor 1: ");
        for (int cont=0; cont<8; cont++) {
            System.out.print(vet1[cont] + " ");
        }
        
        System.out.print("\nVetor 2: ");
        for (int cont=0; cont<8; cont++) {
            System.out.print(vet2[cont] + " ");
        } 
    }
}