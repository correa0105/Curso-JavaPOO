package aula07;
public abstract class Animal {
    
    protected double peso;
    protected int idade;
    protected int membros;
     
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    public void mostrarAnimal(){
        System.out.println("\nPeso: " + this.getPeso());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Membros: " + this.getMembros());
    }
    
    //MÉTODOS

    public abstract void locomover();
    
    public abstract void alimentar();
    
    public abstract void emitirSom();
    
}
