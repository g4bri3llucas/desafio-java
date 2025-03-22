package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    
    public Agenda() {
        contatos = new ArrayList<>();
    }

    
    public void adicionarContato(String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
        System.out.println("Contato adicionado: " + novoContato);
    }

    
    public void removerContato(String nome) {
        Contato contatoRemovido = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoRemovido = contato;
                break;
            }
        }
        if (contatoRemovido != null) {
            contatos.remove(contatoRemovido);
            System.out.println("Contato removido: " + contatoRemovido);
        } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    
    public void buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato);
                return;
            }
        }
        System.out.println("Contato não encontrado: " + nome);
    }

    
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}