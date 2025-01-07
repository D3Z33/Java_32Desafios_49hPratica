package br.com.dezee.produto;

// Implementação da interface Calculavel para Produto Físico
public class ProdutoFisico implements Calculavel {
    private double precoBase;
    private double taxaEntrega;

    // Construtor
    public ProdutoFisico(double precoBase, double taxaEntrega) {
        this.precoBase = precoBase;
        this.taxaEntrega = taxaEntrega;
    }

    // Calcula o preço final adicionando taxa de entrega
    @Override
    public double calcularPrecoFinal() {
        return precoBase + taxaEntrega;
    }

    // Teste da classe
    public static void main(String[] args) {
        ProdutoFisico produto = new ProdutoFisico(150, 20);  // Produto com preço de 150 e taxa de 20
        System.out.println("Preço final do produto físico: R$ " + produto.calcularPrecoFinal());
    }
}