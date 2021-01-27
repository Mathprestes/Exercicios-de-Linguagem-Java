
import javax.swing.JOptionPane;

public class Principal {
    public static void main ( String args[] ){
        
       //instanciar a classe
       Pessoa2 p = new Pessoa2();
       p.setNome ("Joao");
       p.setEndereco ("Ruas kkakaka");
       p.setIdade (23);
       
       JOptionPane.showMessageDialog (null, p.getNome() );
       JOptionPane.showMessageDialog (null, p.getEndereco() );
       JOptionPane.showMessageDialog (null, p.getIdade() );
    }
}