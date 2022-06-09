package aula07;

public class Aula07 {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();

        m.mostrarAnimal();
        m.setPeso(60f);
        m.setIdade(35);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        c.mostrarAnimal();
        c.setPeso(60f);
        m.setIdade(28);
        m.setMembros(4);
        c.setCorPelo("Preto");
        c.alimentar();
        c.locomover();
        c.emitirSom();

    }

}
