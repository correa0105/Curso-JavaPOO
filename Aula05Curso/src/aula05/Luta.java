package aula05;
import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if (isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentarLutador();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentarLutador();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0, 1 OU 2
            
            switch(vencedor){
                case 0:
                System.out.println("EMPATOU!");
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
                break;
                
                case 1:
                System.out.println("O VENCEDOR FOI: " + this.getDesafiado().getNome());
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
                break;
                
                case 2:
                System.out.println("O VENCEDOR FOI: " + this.getDesafiante().getNome());
                this.getDesafiado().perderLuta();
                this.getDesafiante().ganharLuta();
            }
            
        }else{
            System.out.println("A luta nao pode acontecer!");
        }
    }
    
}
