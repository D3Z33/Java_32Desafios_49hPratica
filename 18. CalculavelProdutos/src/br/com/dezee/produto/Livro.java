package br.com.dezee.produto;

// Implementação da interface Calculavel para Livro
public class Livro implements Calculavel {
    private double precoBase;
    private double desconto;

    // Construtor
    public Livro(double precoBase, double desconto) {
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    // Calcula o preço final aplicando desconto
    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * (desconto / 100));
    }

    // Teste da classe
    public static void main(String[] args) {
        Livro livro = new Livro(100, 10);  // Livro com preço de 100 e desconto de 10%
        System.out.println("Preço final do livro: R$ " + livro.calcularPrecoFinal());
    }
}