
public class Produto {
    
    private String nome;
    private String categoria;
    private int quantidade;
    private double valor;
    
    public void setNome (String n) {
        nome = n;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCategoria (String c) {
        categoria = c;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setQuantidade (int q) {
        quantidade = q;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setValor (double x) {
        valor = x;
    }
    
    public double getValor() {
        return valor;
    } 
    
}
