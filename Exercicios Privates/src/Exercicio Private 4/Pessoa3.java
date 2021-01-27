public class Pessoa3 {
    
    private String nome; 
    private int seuAno;
    private int ano;
    private double alt;

    public int idade() {
        return (int) getSeuAno() - getAno();
    }

    public void setNome (String a) {
        nome = a;
    }
    
    public String getNome() {
        return nome;
    } 
    
    public void setSeuAno (int b) {
        seuAno = b;
    } 
    
    public int getSeuAno() {
        return seuAno;
    }
    
    public void setAno (int b) {
        ano = b;
    } 
    
    public int getAno () {
        return ano;
    }
    
    public void setAlt (double c) {
        alt = c;
    }
    
    public double getAlt() {
        return alt;
    }

}
