//Exercicio 6

public class Produto {
    
    private String nome;
    private double preco;
    private double desconto; 

    
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    
    public double calcularPrecoFinal() {
        double valorDesconto = this.preco * (this.desconto / 100);
        return this.preco - valorDesconto;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    
    public static void main(String[] args) {
        
        Produto produto = new Produto("Notebook", 3000.0, 15.0);

        
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$ " + produto.getPreco());
        System.out.println("Desconto: " + produto.getDesconto() + "%");

        
        double precoFinal = produto.calcularPrecoFinal();
        System.out.println("Preço final após desconto: R$ " + precoFinal);
    }
}