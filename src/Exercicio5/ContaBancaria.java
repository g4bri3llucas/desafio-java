package Exercicio5;

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
}