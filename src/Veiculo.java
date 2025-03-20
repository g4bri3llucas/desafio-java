//Exercicio 7

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

