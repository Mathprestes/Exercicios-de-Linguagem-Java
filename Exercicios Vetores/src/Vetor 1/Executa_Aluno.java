//Ex 3: Crie a classe Aluno1 com os atributos nome, nota1 e nota2. Declare um vetor de 5 posições do tipo aluno. 
//Preencha os dados e exiba o nome do aluno com a maior média.


import javax.swing.JOptionPane;

public class Executa_Aluno {
    public static void main (String[] args){
        
    Aluno1 vetor[] = new Aluno1[5];
    
    double maior=0;
    int indiceMaiorMedia=0;

    for (int cont=0; cont<5; cont++) {
        Aluno1 a = new Aluno1();
        a.setNome(JOptionPane.showInputDialog("Nome"));
        a.setN1 (Double.parseDouble(JOptionPane.showInputDialog("Nota 1") ));
        a.setN2 (Double.parseDouble(JOptionPane.showInputDialog("Nota 2") ));
        
        vetor[cont] = a;
    }   
    
    for (int cont=0; cont<5; cont++) {
        
        if (vetor[cont].media() > maior) {
            maior = vetor[cont].media();
            indiceMaiorMedia = cont;
        }
    }      
  
    System.out.println (vetor[indiceMaiorMedia].getNome() + "\n" 
            + vetor[indiceMaiorMedia].media() );
    
    }
}
