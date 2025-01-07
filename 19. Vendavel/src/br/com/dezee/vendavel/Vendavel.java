package br.com.dezee.vendavel;

// Interface para calcular preço de produtos ou serviços
public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentual);
}