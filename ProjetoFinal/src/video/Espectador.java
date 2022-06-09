package video;
public class Espectador extends Pessoa{
   
    private String login;
    private int totAssistido;

    public Espectador(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = totAssistido;
    }
       
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
     
    //MÉTODOS PERSONALIZADOS
    public void viusMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + nome + ", Sexo=" + sexo + ", Idade=" + idade + ", Experiencia=" + experiencia + ", Total Assistidos=" + totAssistido + ", Login=" + login +'}';
    }
    
}
