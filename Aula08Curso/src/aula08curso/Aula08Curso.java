package aula08curso;
public class Aula08Curso {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
                 
        System.out.println("\n");
        
        Lobo lobo = new Lobo();
        
        System.out.println("\n");
        
        Cachorro cachorro = new Cachorro();
        cachorro.reagir("Quer comida?");
        cachorro.reagir("Vai apanhar!");
        cachorro.reagir(11, 45);
        cachorro.reagir(21, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5);
        cachorro.reagir(17, 4.5);
        
    }
    
}
