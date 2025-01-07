package br.com.dezee.geometria;

// Implementação da interface CalculoGeometrico
public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    // Construtor para definir altura e largura
    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    // Cálculo da área (altura * largura)
    @Override
    public double calcularArea() {
        return altura * largura;
    }

    // Cálculo do perímetro (2 * (altura + largura))
    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    // Teste da classe
    public static void main(String[] args) {
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(5, 8);  // Exemplo com altura 5m e largura 8m

        System.out.println("Altura: 5m | Largura: 8m");
        System.out.println("Área da sala: " + sala.calcularArea() + " m²");
        System.out.println("Perímetro da sala: " + sala.calcularPerimetro() + " m");
    }
}
