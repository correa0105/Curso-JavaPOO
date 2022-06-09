package exercicios1;

import java.util.Random;

public class Livro implements Controlador {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("\nLeitor: " + this.getLeitor().getNome());
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Pagina: " + this.getTotPaginas());
        System.out.println("Pagina Atual: " + this.getPagAtual());
        System.out.println("O livro esta aberto? " + this.isAberto());
    }

    @Override
    public void abrir() {
        if (this.isAberto() != true) {
            this.setAberto(true);
            System.out.println("Abrindo o livro!");
        } else {
            System.out.println("O Livro ja esta aberto!");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println("Fechando o livro!");
        } else {
            System.out.println("O livro ja esta fechado!");
        }
    }

    @Override
    public void folhear(int fo) {
        if (fo > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(fo);
        }
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }

}
