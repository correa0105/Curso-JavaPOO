package video;
public class ProjetoYouTube {
    
    public static void main(String[] args) {
        
        Video vid[] = new Video[3];
        vid[0] = new Video("Aula 1 de JavaScript");
        vid[1] = new Video("Aula 2 de JavaScript");
        vid[2] = new Video("Aula 3 de JavaScript");
                
        Espectador espec[] = new Espectador[3];
        espec[0] = new Espectador("Lucas", "Masculino", 21, "Inter@2020");
        espec[1] = new Espectador("Vitor", "Masculino", 19, "uSN@2101");
        espec[2] = new Espectador("Julia", "Feminino", 27, "Julia2020");
        
        Visualizacao visu[] = new Visualizacao[3];
        visu[0] = new Visualizacao(espec[0], vid[2]);
        visu[1] = new Visualizacao(espec[2], vid[1]);
        visu[2] = new Visualizacao(espec[1], vid[0]);
        
        visu[0].avaliar(90);
        
        System.out.println("\nVisualizacao\n--------------------");
        
        System.out.println(visu[0].toString());
        System.out.println(visu[1].toString());
        System.out.println(visu[2].toString());
        
        System.out.println("\nVideos\n--------------------");
        System.out.println(vid[0].toString());
        System.out.println(vid[1].toString());
        System.out.println(vid[2].toString());
        
        System.out.println("\nEspectadores\n--------------------");
        System.out.println(espec[0].toString());
        System.out.println(espec[1].toString());
        System.out.println(espec[2].toString());
        
        
    }
    
}
