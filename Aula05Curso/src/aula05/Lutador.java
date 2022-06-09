package aula05;
public class Lutador{

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nameLut, String nationalityLut, int ageLut, float heightLut, float weightLut, int winLut, int lossLut, int drawLut) {

        this.setNome(nameLut);
        this.setNacionalidade(nationalityLut);
        this.setIdade(ageLut);
        this.setAltura(heightLut);
        this.setPeso(weightLut);
        this.setVitorias(winLut);
        this.setDerrotas(lossLut);
        this.setEmpates(drawLut);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = ("Invalido");
        } else if (this.getPeso() <= 70.3) {
            this.categoria = ("Pena");
        } else if (this.getPeso() <= 83.9) {
            this.categoria = ("Leve");
        } else if (this.getPeso() <= 120.2) {
            this.categoria = ("Pesado");
        } else {
            this.categoria = ("Invalido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentarLutador() {
        System.out.println("\n========= APRESENTAMOS O LUTADOR =========");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("==========================================");
    }

    public void statusLutador() {
        System.out.println("\n================= STATUS =================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("E Peso: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("==========================================");
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }

}
