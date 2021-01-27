
import javax.swing.JOptionPane;

public class ExAluno {
    
    String nome;
    double nota1;
    double nota2;
    double m;
    
    public void calcularMedia() {
        
        nome = JOptionPane.showInputDialog ("Nome");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog ("Nota1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog ("Nota2")); 
        
        m = nota1 + nota2 / 2;
    } 
    
    public void exibir () {
        JOptionPane.showMessageDialog (null, "\nNome: " + nome + "\nMedia: " + m);
    } 
}


