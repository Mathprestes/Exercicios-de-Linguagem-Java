package trabdeprogramaçaoemJAVA;

import javax.swing.JOptionPane;

public class Ex4 {
     
     public static void main (String args[]) {
         
        int ano, atual;
        int idade = 0, anfuturo;

        ano = Integer.parseInt(JOptionPane.showInputDialog ("Ano de Nascimento: "));
        atual = Integer.parseInt(JOptionPane.showInputDialog ("Ano Atual: "));
        
        idade = atual - ano;
        anfuturo = 2038 - ano;
        
        JOptionPane.showMessageDialog (null, "Sua Idade é: " + idade);
        JOptionPane.showMessageDialog (null, "Sua Idade é: " + anfuturo);
    }
}