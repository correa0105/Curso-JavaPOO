package aula2;
public class Aula02 {
    public static void main(String[] args) {
       
       Caneta c1 = new Caneta("BIC", "Verde", 0.5f);
       //c1.setModelo("BIC");
       //c1.setPonta(0.5f);
       c1.status();
       
       Caneta c2 = new Caneta("FaberCastel", "Marrom", 1);
       c2.status();
    }
    
}
