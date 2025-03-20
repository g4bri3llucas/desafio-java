//Exercicio 4

public class Funcionario {
    
    private String nome;
    private double salario;

    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            double aumento = this.salario * (percentual / 100);
            this.salario += aumento;
            System.out.println("Salário aumentado em " + percentual + "%. Novo salário: R$ " + this.salario);
        } else {
            System.out.println("Percentual de aumento inválido. O valor deve ser maior que 0.");
        }
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("João Silva", 3000.0);

        
        System.out.println("Salário inicial de " + funcionario.getNome() + ": R$ " + funcionario.getSalario());

        
        funcionario.aumentarSalario(10);

        
        funcionario.aumentarSalario(5);

        
        funcionario.aumentarSalario(-5); // Isso exibirá uma mensagem de erro
    }
}