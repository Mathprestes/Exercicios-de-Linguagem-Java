
import javax.swing.JOptionPane;

public class Vetor_Pessoa {
    public static void main (String[] args){
        
    Pessoa v[] = new Pessoa[3];    
    
    for (int cont=0; cont<3; cont++) {
        Pessoa p = new Pessoa();
        p.setNome(JOptionPane.showInputDialog("Nome"));
        p.setIdade (Integer.parseInt(JOptionPane.showInputDialog("Idade")));
        v[cont] = p;
    }        
  
    for (int cont=0; cont<3; cont++) {
        System.out.println ("Nome: "+ v[cont] + "-" + "Idade: "+ v[cont].getIdade() );
    }
  }
}

