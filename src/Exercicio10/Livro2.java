package Exercicio10;

public class Livro2 {
    private String titulo;
    private String autor;
    private boolean disponivel;

    
    public Livro2(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro não disponível: " + titulo);
        }
    }

    
    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido: " + titulo);
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ") - " + (disponivel ? "Disponível" : "Emprestado");
    }
}