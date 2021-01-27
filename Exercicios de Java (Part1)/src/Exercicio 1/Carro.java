
import javax.swing.JOptionPane;

public class Carro {

    //atributos
    private String nome;
    private String marca;
    private int placa;
    private int ano;
    
    //modificadores de visibilidade
    //private: somente a propria classe pode acessar
    //public: qualquer classe tem acesso
    //protected: em breve
    
    //metodos
    public void preencher () {
        nome = JOptionPane.showInputDialog ("Nome");
        marca = JOptionPane.showInputDialog ("Marca");
        placa = Integer.parseInt(JOptionPane.showInputDialog ("Placa"));
        ano = Integer.parseInt(JOptionPane.showInputDialog ("Ano"));
    }
    
    public void exibir () {
        JOptionPane.showMessageDialog (null, "\nNome: " + nome + "\nMarca: " + marca + 
                "\nPlaca: " + placa + "\nAno: " + ano);
    } 
    
    
    //PODE FAZER ASSIM TUDO JUNTO, OU COM UM SEGUNDO ARQUIVO PRINCPAL
    //public static void main (String args[]) {
        //Instancia
        //Carro p = new Carro(); 
        //p.preencher();
        // p.exibir();
        
        //Carro p2 = new Carro();
        //p.preencher();
        //p.exibir();   
        //}     
}











