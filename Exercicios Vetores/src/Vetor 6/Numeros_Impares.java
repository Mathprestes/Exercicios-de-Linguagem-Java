//Ex 1: Leia um vetor de 10 valores inteiros e exiba todos os valores ímpares.
import javax.swing.JOptionPane;

public class Numeros_Impares{
    public static void main(String args[]){

    int vetor[] = new int[10];
    
    for (int cont=0; cont<10; cont++){
         vetor[cont] = Integer.parseInt(JOptionPane.showInputDialog("digiyr"));
    }
    
    for (int cont=0; cont<10; cont++) {
        
        if (vetor[cont] % 2 != 0)
            System.out.println(vetor[cont]);
        }
    }
}