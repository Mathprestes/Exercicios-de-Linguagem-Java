import javax.swing.JOptionPane;

public class ExCalculadora {

    int valor1;
    int valor2;
    int som; 
    int mult;
    int div;
    int sub;

    public void calculadora() {
        
        valor1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor 1"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor 2")); 
        
        som = (int) (valor1 + valor2);
        mult = (int) (valor1 * valor2);
        div = (int) (valor1 / valor2);
        sub = (int) (valor1 - valor2);
    } 
    
    public void exibir () {

    JOptionPane.showMessageDialog (null, "\nSoma: " + som + "\nMultiplicaçao: " + mult +
                "\nDivisao: " + div + "\nSubtraçao: " + sub);
    } 
}
