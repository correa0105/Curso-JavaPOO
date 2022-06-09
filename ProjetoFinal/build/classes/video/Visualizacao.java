package video;
public class Visualizacao {
    
    private Espectador espectador;
    private Video filme;

    public Visualizacao(Espectador espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
  
    @Override
    public String toString() {
        return "Visualizacao{" + "Espectador=" + espectador + ", Filme=" + filme + '}';
    }
    
    //MÉTODOS PERSONALIZADOS
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(double porc){
        int total;
        if (porc <= 20) {
            total = 3;
        } else if (porc <= 50) {
            total = 5;
        } else if (porc <= 90) {
            total = 8;
        } else{
            total = 10;
        }
        
        this.filme.setAvaliacao(total);
    }

    
    
}