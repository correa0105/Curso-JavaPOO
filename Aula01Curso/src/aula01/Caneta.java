package aula01;
public class Caneta {
    
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;
    
    void statusCaneta(){
        System.out.println("\n#### Caneta ####");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
   public  void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Nao posso rabiscar, esta tampada!");
        }else{
            System.out.println("Estou rabiscando!");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
}
