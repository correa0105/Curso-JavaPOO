package exercicios1;
public class Exercicios1 {
    public static void main(String[] args) {
        
        Pessoa pe[] = new Pessoa[3];
        Livro li[]= new Livro[3];
        
        
        pe[0] = new Pessoa("Lucas Correa", 21, "Masculino");
        pe[1] = new Pessoa("Vitor", 24, "Masculino");
        pe[2] = new Pessoa("Paula", 18, "Feminino");
        
        li[0] = new Livro("Harry Potter", "J.K Rowlling", 248, pe[0]);
        li[1] = new Livro("Shakerpeare", "Shakespeare Studio", 190, pe[1]);
        li[2] = new Livro("Senhor dos Aneis", "Tirulipa", 321, pe[2]);
        
        pe[0].fazerAniver();
        li[0].abrir();
        li[0].folhear(244);
        li[0].voltarPag();
        pe[0].pessoa();
        li[0].detalhes();
        
    }
    
}
