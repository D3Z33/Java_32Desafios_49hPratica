package br.com.dezee.vendavel;

// Implementação da interface Vendavel para Serviço
public class Servico implements Vendavel {
    private double precoPorHora;
    private double desconto;

    // Construtor
    public Servico(double precoPorHora) {
        this.precoPorHora = precoPorHora;
        this.desconto = 0;
    }

    // Calcula o preço total com base na quantidade de horas
    @Override
    public double calcularPrecoTotal(int horas) {
        double precoComDesconto = precoPorHora - (precoPorHora * (desconto / 100));
        return precoComDesconto * horas;
    }

    // Aplica desconto na taxa por hora
    @Override
    public void aplicarDesconto(double percentual) {
        this.desconto = percentual;
    }

    // Teste da classe
    public static void main(String[] args) {
        Servico desenvolvimentoWeb = new Servico(150);  // Serviço de desenvolvimento web: R$ 150/hora
        desenvolvimentoWeb.aplicarDesconto(5);  // Aplica 5% de desconto

        System.out.println("Preço total (8 horas): R$ " + desenvolvimentoWeb.calcularPrecoTotal(8));
    }
}