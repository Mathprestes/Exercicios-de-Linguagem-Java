public class Pessoa {
    private String nome;
    private String endereco; 
    private int idade;
    
    public void setNome (String n) {
        nome = n;
    } 
    
    public String getNome () {
        return nome;
    }
    
    public void setEndereco (String e) {
        endereco = e;
    }
    
    public String getEndereco () {
        return endereco;
    }
    
    public void setIdade (int x){
        idade = x;
    }
    
    public int getIdade () {
        return idade;
    }
    
}
