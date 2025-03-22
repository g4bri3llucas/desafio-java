package Exercicio9;

public class MainP {
    public static void main(String[] args) {
        
        Produto2 produto1 = new Produto2("Camiseta", 49.90);
        Produto2 produto2 = new Produto2("Calça Jeans", 99.90);
        Produto2 produto3 = new Produto2("Tênis", 199.90);

        
        Pedido pedido = new Pedido();

        
        pedido.adicionarItem(produto1);
        pedido.adicionarItem(produto2);
        pedido.adicionarItem(produto3);

        
        pedido.exibirResumo();

        
        pedido.removerItem("Calça Jeans");

        
        pedido.exibirResumo();
    }
}