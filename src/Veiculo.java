/* numero 1 
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
} */




/* numero 2
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
}  */



/* numero 3 
public class Retangulo {
    
    private double largura;
    private double altura;

    
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    
    public double calcularArea() {
        return this.largura * this.altura;
    }

    
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo(5.0, 10.0);

        
        double area = retangulo.calcularArea();
        System.out.println("A área do retângulo é: " + area);
    }
}    */



/* numero 4 
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
} */



/*numero 5 
public class ContaBancaria {
    
    private double saldo;

    
    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Saldo inicial não pode ser negativo. Definindo saldo inicial como 0.");
            this.saldo = 0;
        }
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que 0.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente. Não foi possível realizar o saque de R$ " + valor + ".");
            }
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser maior que 0.");
        }
    }

    
    public double getSaldo() {
        return this.saldo;
    }

    
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria(1000);

        
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        
        conta.depositar(500);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        
        conta.sacar(300);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        
        conta.sacar(2000);
        System.out.println("Saldo após tentativa de saque: R$ " + conta.getSaldo());

        
        conta.depositar(-100);
        System.out.println("Saldo após tentativa de depósito inválido: R$ " + conta.getSaldo());

        
        conta.sacar(-50);
        System.out.println("Saldo após tentativa de saque inválido: R$ " + conta.getSaldo());
    }
}  */


/* numero 6 
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
} */


//numero 7 
public class Veiculo {
    
    private double capacidadeTanque; 
    private double litrosNoTanque;   

    
    public Veiculo(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
        this.litrosNoTanque = 0; 
    }

    
    public void abastecer(double litros) {
        if (litros > 0) {
            double novoNivel = this.litrosNoTanque + litros;
            if (novoNivel <= this.capacidadeTanque) {
                this.litrosNoTanque = novoNivel;
                System.out.println("Abastecidos " + litros + " litros. Nível atual: " + this.litrosNoTanque + " litros.");
            } else {
                
                this.litrosNoTanque = this.capacidadeTanque;
                System.out.println("Tanque cheio! Capacidade máxima atingida: " + this.capacidadeTanque + " litros.");
            }
        } else {
            System.out.println("Quantidade de litros inválida. O valor deve ser maior que 0.");
        }
    }

    
    public double getLitrosNoTanque() {
        return this.litrosNoTanque;
    }

    
    public double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo(50);

        
        System.out.println("Capacidade do tanque: " + veiculo.getCapacidadeTanque() + " litros.");

        
        veiculo.abastecer(20);
        System.out.println("Litros no tanque: " + veiculo.getLitrosNoTanque());

        
        veiculo.abastecer(40);
        System.out.println("Litros no tanque: " + veiculo.getLitrosNoTanque());

        
        veiculo.abastecer(-10);
        System.out.println("Litros no tanque: " + veiculo.getLitrosNoTanque());
    }
} 

