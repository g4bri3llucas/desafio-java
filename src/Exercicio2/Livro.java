package Exercicio2;

public class Livro {
    
    private String titulo;
    private String autor;

    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    
    public void detalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
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

    
    public static void main(String[] args) {
        
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        
        livro.detalhes();
    }
}