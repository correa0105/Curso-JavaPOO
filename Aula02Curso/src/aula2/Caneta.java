package aula2;
public class Caneta {
   
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c, float p){
       this.modelo = m;
       this.cor = c;
       this.ponta = p;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("\n### INFORMACOES CANETA ###");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Esta tampada? " + this.isTampada());
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
}
