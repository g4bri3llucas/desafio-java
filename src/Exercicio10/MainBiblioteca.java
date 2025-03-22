package Exercicio10;


public class MainBiblioteca {
    public static void main(String[] args) {
        
        Livro2 livro1 = new Livro2("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro2 livro2 = new Livro2("1984", "George Orwell");

        
        Usuario usuario1 = new Usuario("João Silva", 1);
        Usuario usuario2 = new Usuario("Maria Souza", 2);

        
        System.out.println("Status inicial dos livros:");
        System.out.println(livro1);
        System.out.println(livro2);

        
        Emprestimo emprestimo1 = new Emprestimo(livro1, usuario1);
        emprestimo1.registrarEmprestimo();

        Emprestimo emprestimo2 = new Emprestimo(livro2, usuario2);
        emprestimo2.registrarEmprestimo();

        
        Emprestimo emprestimo3 = new Emprestimo(livro1, usuario2);
        emprestimo3.registrarEmprestimo();

        
        System.out.println("\nStatus dos livros após empréstimos:");
        System.out.println(livro1);
        System.out.println(livro2);

        
        emprestimo1.registrarDevolucao();
        emprestimo2.registrarDevolucao();

        
        System.out.println("\nStatus dos livros após devoluções:");
        System.out.println(livro1);
        System.out.println(livro2);
    }
}