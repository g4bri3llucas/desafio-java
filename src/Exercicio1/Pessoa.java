package Exercicio1;

public class Pessoa {
    
    private String nome;
    private int idade;

    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public void apresentar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João", 25);

        
        pessoa.apresentar();
    }
}