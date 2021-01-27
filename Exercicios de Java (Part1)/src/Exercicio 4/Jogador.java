
public class Jogador {
    
    private String nome;
    public String pos;
    public String nacio;
    private int data;
    private double alt;
    private double peso;
    
    void setNome (String a) {
        nome = a;
    }
    
    String getNome() {
        return nome;
    }
    
    public void setPos (String b) {
        pos = b;
    }
    
    public String getPos() {
        return pos;
    }
    
    public void setNacio (String c) {
        nacio = c;
    }
    
    public String getNacio() {
        return nacio;
    }
    
    void setData (int d) {
        data = d;
    }
           
    int getData() {
        return data;
    }
    
    void setAlt (double e) {
        alt = e;
    }
    
    double getAlt() {
        return alt;
    }
    
    void setPeso (double f) {
        peso = f;
    }
    
    double getPeso() {
        return peso;
    }
    
}