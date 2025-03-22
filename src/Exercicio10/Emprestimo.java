package Exercicio10;

public class Emprestimo {
    private Livro2 livro;
    private Usuario usuario;

    
    public Emprestimo(Livro2 livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    
    public void registrarEmprestimo() {
        if (livro.isDisponivel()) {
            livro.emprestar();
            System.out.println("Empréstimo registrado para: " + usuario.getNome());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    
    public void registrarDevolucao() {
        livro.devolver();
        System.out.println("Devolução registrada para: " + usuario.getNome());
    }

    @Override
    public String toString() {
        return "Empréstimo: " + livro.getTitulo() + " -> " + usuario.getNome();
    }
}