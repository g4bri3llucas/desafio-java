package Exercicio8;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        
        agenda.adicionarContato("João", "1234-5678");
        agenda.adicionarContato("Maria", "8765-4321");
        agenda.adicionarContato("Pedro", "5555-5555");

        
        agenda.listarContatos();

        
        agenda.buscarContato("Maria");

        
        agenda.removerContato("João");

        
        agenda.listarContatos();
    }
}