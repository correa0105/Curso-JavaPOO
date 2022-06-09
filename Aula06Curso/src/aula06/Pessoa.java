package aula06;
public abstract class Pessoa {
    
    private String nome, sexo;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    //MÉTODO INTERNO
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public void dadosPessoa(){
        System.out.println("\nNome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
    }
    
}
