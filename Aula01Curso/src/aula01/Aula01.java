package aula01;
public class Aula01 {
    public static void main(String[] args) {
       
       Caneta c1 = new Caneta();
       c1.modelo = "Bic";
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.carga = 75;
       c1.tampar();
       c1.statusCaneta();
       c1.rabiscar();
       
       Caneta c2 = new Caneta();
       c2.modelo = "FaberCastel";
       c2.cor = "Vermelha";
       c2.ponta = 1.0f;
       c2.carga = 90;
       c2.destampar();
       c2.statusCaneta();
       c2.rabiscar();
       
    }
    
}
