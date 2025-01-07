package br.com.dezee.vendavel;

// Implementação da interface Vendavel para Produto
public class Produto implements Vendavel {
    private double precoBase;
    private double desconto;

    // Construtor
    public Produto(double precoBase) {
        this.precoBase = precoBase;
        this.desconto = 0;
    }

    // Calcula o preço total multiplicado pela quantidade
    @Override
    public double calcularPrecoTotal(int quantidade) {
        double precoComDesconto = precoBase - (precoBase * (desconto / 100));
        return precoComDesconto * quantidade;
    }

    // Aplica um desconto ao preço base
    @Override
    public void aplicarDesconto(double percentual) {
        this.desconto = percentual;
    }

    // Teste da classe
    public static void main(String[] args) {
        Produto celular = new Produto(1200);  // Celular com preço base de R$ 1200
        celular.aplicarDesconto(10);  // Aplica desconto de 10%

        System.out.println("Preço total (3 unidades): R$ " + celular.calcularPrecoTotal(3));
    }
}