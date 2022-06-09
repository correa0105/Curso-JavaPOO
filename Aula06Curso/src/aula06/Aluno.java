package aula06;
public class Aluno extends Pessoa{
    
    private String curso;
    private int matricula;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //MÉTODO INTERNO
    public void cancelarMatricula(){
        System.out.println("Matricula sera cancelada!");
    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade!" + this.getNome());
    }
}
