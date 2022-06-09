package aula06;
public class Aula06 {
    public static void main(String[] args) {
        
        //Visitante p1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        //Funcionario p4 = new Funcionario();
        
        a1.setNome("Lucas");
        a1.setMatricula(202114470);
        a1.setIdade(18);
        a1.setSexo("M");
        a1.dadosPessoa();
        a1.pagarMensalidade();
        
        b1.setNome("Silvana");
        b1.setMatricula(202114478);
        b1.setIdade(21);
        b1.setSexo("F");
        b1.dadosPessoa();
        b1.pagarMensalidade();
                
    }
    
}
