//Exercicio 3

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
}