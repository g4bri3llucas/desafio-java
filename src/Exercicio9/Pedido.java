package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto2> itens; 

    
    public Pedido() {
        itens = new ArrayList<>();
    }

    
    public void adicionarItem(Produto2 produto) { 
        itens.add(produto);
        System.out.println("Item adicionado: " + produto);
    }

    
    public void removerItem(String nome) {
        Produto2 itemRemovido = null; 
        for (Produto2 produto : itens) { 
            if (produto.getNome().equalsIgnoreCase(nome)) {
                itemRemovido = produto;
                break;
            }
        }
        if (itemRemovido != null) {
            itens.remove(itemRemovido);
            System.out.println("Item removido: " + itemRemovido);
        } else {
            System.out.println("Item não encontrado: " + nome);
        }
    }

    
    public double calcularTotal() {
        double total = 0;
        for (Produto2 produto : itens) { 
            total += produto.getPreco();
        }
        return total;
    }

    
    public void exibirResumo() {
        if (itens.isEmpty()) {
            System.out.println("O pedido está vazio.");
        } else {
            System.out.println("Resumo do pedido:");
            for (Produto2 produto : itens) { 
                System.out.println(produto);
            }
            System.out.println("Total do pedido: R$ " + String.format("%.2f", calcularTotal()));
        }
    }
}