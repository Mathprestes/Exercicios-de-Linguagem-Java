/*
*Criar uma classe chamada Emprego com os campos cargo e salario. 
*Criar a classe Pessoa que possui nome e emprego
 */

public class Executa {
    public static void main (String[] args) {
        
        Emprego e = new Emprego();
        Pessoa p = new Pessoa();
        
        e.setCargo ("Analista");
        e.setSalario (6000);
        
        p.setNome ("Matheus");
        p.setEmprego (e);
        
        System.out.println (p.getNome() );
        System.out.println (p.getEmprego().getCargo() );
        System.out.println (p.getEmprego().getSalario() );
    }
}
