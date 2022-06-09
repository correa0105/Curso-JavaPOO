package aula08curso;
public class Cachorro extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }
    
    public void reagir(String frase){
        if(frase == "Quer comida?" || frase == "Vamos passear"){
            System.out.println("Cachorro abanou o rabo e latiu!");
        }else{
            System.out.println("Rosnou!");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Cachorro abanou o rabo!");
        }else if (hora>=18){
            System.out.println("Rosnou!");
        }else{
            System.out.println("Cachorro abanou o rabo e latiu!");
        }
    }
        
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Cachorro abanou o rabo!");
        }else{
            System.out.println("Rosnou!");
        }
    }
            
    public void reagir(int idade, double peso){
    if (idade<5){
       if (peso<10){
           System.out.println("Cachorro abanou o rabo!");}
               else{System.out.println("Latir!");}
                   if(peso<10){
                       System.out.println("Rosnou!");}
                           else{System.out.println("Ignorou!");}
    }
  }
}
