package aula03;
public class Aula03 {
    public static void main(String[] args) {
       
        Conta p1 = new Conta();
        p1.setNumConta(417);
        p1.setDonoConta("Lucas Correa");
        p1.abrirConta("CC");
        
        Conta p2 = new Conta();
        p2.setNumConta(416);
        p2.setDonoConta("Joao Bolao");
        p2.abrirConta("CP");
        
        p1.depositar(250);
        p2.depositar(500);
        
        p1.pagarMensalidade();
        p2.pagarMensalidade();
        
        p1.statusAtualConta();
        p2.statusAtualConta();
    }
    
}
